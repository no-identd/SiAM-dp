/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.scxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.scxml.invoke.Invoker;
import org.apache.commons.scxml.model.Datamodel;
import org.apache.commons.scxml.model.History;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.Observable;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.State;
import org.apache.commons.scxml.model.TransitionTarget;
import org.apache.commons.scxml.semantics.SCXMLSemanticsImpl;

/**
 * <p>
 * The SCXML &quot;engine&quot; that executes SCXML documents. The particular
 * semantics used by this engine for executing the SCXML are encapsulated in the
 * SCXMLSemantics implementation that it uses.
 * </p>
 * 
 * <p>
 * The default implementation is
 * <code>org.apache.commons.scxml.semantics.SCXMLSemanticsImpl</code>
 * </p>
 * 
 * @see SCXMLSemantics
 */
public class SCXMLExecutor implements Serializable {

	// @CUSTOM, @NEW {
	private final List<String> breakpointStates = new ArrayList<String>(0);
	private boolean checkBreakpoints = false;

	public void setBreakpoints(List<String> stateIds) {
		breakpointStates.clear();
		breakpointStates.addAll(stateIds);
		checkBreakpoints = !stateIds.isEmpty();
	}

	// }

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The Logger for the SCXMLExecutor.
	 */
	private final Log log = LogFactory.getLog(SCXMLExecutor.class);

	/**
	 * The stateMachine being executed.
	 */
	private SCXML stateMachine;

	/**
	 * The current status of the stateMachine.
	 */
	private Status currentStatus;

	/**
	 * The event dispatcher to interface with external documents etc.
	 */
	private EventDispatcher eventdispatcher;

	/**
	 * The environment specific error reporter.
	 */
	private ErrorReporter errorReporter = null;

	/**
	 * Run-to-completion.
	 */
	private boolean superStep = true;

	/**
	 * Interpretation semantics.
	 */
	private SCXMLSemantics semantics;

	/**
	 * The SCInstance.
	 */
	private final SCInstance scInstance;

	/**
	 * The worker method. Re-evaluates current status whenever any events are
	 * triggered.
	 * 
	 * @param evts
	 *            an array of external events which triggered during the last
	 *            time quantum
	 * @throws ModelException
	 *             in case there is a fatal SCXML object model problem.
	 */
	public synchronized void triggerEvents(final TriggerEvent[] evts) throws ModelException {
		// Set event data, saving old values
		Object[] oldData = setEventData(evts);

		// Forward events (external only) to any existing invokes,
		// and finalize processing
		semantics.processInvokes(evts, errorReporter, scInstance);

		List<TriggerEvent> evs = new ArrayList<TriggerEvent>(Arrays.asList(evts));
		Step step = null;

		// for (TriggerEvent ev : evs) {
		// log.info("Trigger Event: " + ev.getName() + " (" + ev.getType() +
		// ")");
		// }

		do {
			// CreateStep
			step = new Step(evs, currentStatus);
			// EnumerateReachableTransitions
			semantics.enumerateReachableTransitions(stateMachine, step, errorReporter);
			// FilterTransitionSet
			semantics.filterTransitionsSet(step, eventdispatcher, errorReporter, scInstance);
			// FollowTransitions
			semantics.followTransitions(step, errorReporter, scInstance);
			// UpdateHistoryStates
			semantics.updateHistoryStates(step, errorReporter, scInstance);
			// ExecuteActions
			semantics.executeActions(step, stateMachine, eventdispatcher, errorReporter, scInstance);
			// AssignCurrentStatus
			updateStatus(step);
			// ***Cleanup external events if superStep
			if (superStep) {
				evs.clear();
			}
		} while (superStep && currentStatus.getEvents().size() > 0);

		// InitiateInvokes only after state machine has stabilized
		semantics.initiateInvokes(step, errorReporter, scInstance);
		getSCInstance().getNotificationRegistry().fireOnStable(stateMachine);

		// Restore event data
		restoreEventData(oldData);
		logState();
	}

	/**
	 * Convenience method when only one event needs to be triggered.
	 * 
	 * @param evt
	 *            the external events which triggered during the last time
	 *            quantum
	 * @throws ModelException
	 *             in case there is a fatal SCXML object model problem.
	 */
	public void triggerEvent(final TriggerEvent evt) throws ModelException {
		triggerEvents(new TriggerEvent[] { evt });
	}

	/**
	 * Constructor.
	 * 
	 * @param expEvaluator
	 *            The expression evaluator
	 * @param evtDisp
	 *            The event dispatcher
	 * @param errRep
	 *            The error reporter
	 */
	public SCXMLExecutor(final Evaluator expEvaluator, final EventDispatcher evtDisp, final ErrorReporter errRep) {
		this(expEvaluator, evtDisp, errRep, null);
	}

	/**
	 * Convenience constructor.
	 */
	public SCXMLExecutor() {
		this(null, null, null, null);
	}

	/**
	 * Constructor.
	 * 
	 * @param expEvaluator
	 *            The expression evaluator
	 * @param evtDisp
	 *            The event dispatcher
	 * @param errRep
	 *            The error reporter
	 * @param semantics
	 *            The SCXML semantics
	 * @param activeStates
	 *            The activeStates
	 */
	public SCXMLExecutor(final Evaluator expEvaluator, final EventDispatcher evtDisp, final ErrorReporter errRep, final SCXMLSemantics semantics) {
		this.eventdispatcher = evtDisp;
		this.errorReporter = errRep;
		this.currentStatus = new Status();
		this.stateMachine = null;
		if (semantics == null) {
			// Use default semantics, if none provided
			this.semantics = new SCXMLSemanticsImpl();
		} else {
			this.semantics = semantics;
		}
		this.scInstance = new SCInstance(this);
		this.scInstance.setEvaluator(expEvaluator);
	}

	/**
	 * Clear all state and begin from &quot;initialstate&quot; indicated on root
	 * SCXML element.
	 * 
	 * @throws ModelException
	 *             in case there is a fatal SCXML object model problem.
	 */
	public synchronized void reset() throws ModelException {
		// Reset all variable contexts
		Context rootCtx = scInstance.getRootContext();
		// Clone root datamodel
		if (stateMachine == null) {
			log.error(ERR_NO_STATE_MACHINE);
			throw new ModelException(ERR_NO_STATE_MACHINE);
		} else {
			Datamodel rootdm = stateMachine.getDatamodel();
			SCXMLHelper.cloneDatamodel(rootdm, rootCtx, scInstance.getEvaluator(), log);
		}
		// all states and parallels, only states have variable contexts
		for (TransitionTarget tt : stateMachine.getTargets().values()) {
			if (tt instanceof State) {
				Context context = scInstance.lookupContext(tt);
				if (context != null) {
					context.reset();
					Datamodel dm = tt.getDatamodel();
					if (dm != null) {
						SCXMLHelper.cloneDatamodel(dm, context, scInstance.getEvaluator(), log);
					}
				}
			} else if (tt instanceof History) {
				scInstance.reset((History) tt);
			}
		}
		// CreateEmptyStatus
		currentStatus = new Status(currentStatus.getStates());
		Step step = new Step(null, currentStatus);
		// DetermineInitialStates
		semantics.determineInitialStates(stateMachine, step.getAfterStatus().getStates(), step.getEntryList(), errorReporter, scInstance);
		// ExecuteActions
		semantics.executeActions(step, stateMachine, eventdispatcher, errorReporter, scInstance);
		// AssignCurrentStatus
		updateStatus(step);
		// Execute Immediate Transitions
		if (superStep && currentStatus.getEvents().size() > 0) {
			this.triggerEvents(new TriggerEvent[0]);
		} else {
			// InitiateInvokes only after state machine has stabilized
			semantics.initiateInvokes(step, errorReporter, scInstance);
			getSCInstance().getNotificationRegistry().fireOnStable(stateMachine);
			logState();

		}
	}

	/**
	 * Get the current status.
	 * 
	 * @return The current Status
	 */
	public synchronized Status getCurrentStatus() {
		return currentStatus;
	}

	/**
	 * Set the expression evaluator. <b>NOTE:</b> Should only be used before the
	 * executor is set in motion.
	 * 
	 * @param evaluator
	 *            The evaluator to set.
	 */
	public void setEvaluator(final Evaluator evaluator) {
		this.scInstance.setEvaluator(evaluator);
	}

	/**
	 * Get the expression evaluator in use.
	 * 
	 * @return Evaluator The evaluator in use.
	 */
	public Evaluator getEvaluator() {
		return scInstance.getEvaluator();
	}

	/**
	 * Set the root context for this execution. <b>NOTE:</b> Should only be used
	 * before the executor is set in motion.
	 * 
	 * @param rootContext
	 *            The Context that ties to the host environment.
	 */
	public void setRootContext(final Context rootContext) {
		this.scInstance.setRootContext(rootContext);
	}

	/**
	 * Get the root context for this execution.
	 * 
	 * @return Context The root context.
	 */
	public Context getRootContext() {
		return scInstance.getRootContext();
	}

	/**
	 * Get the state machine that is being executed. <b>NOTE:</b> This is the
	 * state machine definition or model used by this executor instance. It may
	 * be shared across multiple executor instances and as a best practice,
	 * should not be altered. Also note that manipulation of instance data for
	 * the executor should happen through its root context or state contexts
	 * only, never through the direct manipulation of any {@link Datamodel}s
	 * associated with this state machine definition.
	 * 
	 * @return Returns the stateMachine.
	 */
	public SCXML getStateMachine() {
		return stateMachine;
	}

	/**
	 * Set the state machine to be executed. <b>NOTE:</b> Should only be used
	 * before the executor is set in motion.
	 * 
	 * @param stateMachine
	 *            The stateMachine to set.
	 */
	public void setStateMachine(final SCXML stateMachine) {
		// NormalizeStateMachine
		SCXML sm = semantics.normalizeStateMachine(stateMachine, errorReporter);
		// StoreStateMachine
		this.stateMachine = sm;
	}

	public void setActiveStates(Set<String> activeStates) {
		Map<String, TransitionTarget> allStates = SCXMLHelper.getAllSubStates(stateMachine);
		Set<TransitionTarget> active = new HashSet<TransitionTarget>(activeStates.size());
		for (String id : activeStates) {
			active.add(allStates.get(id));
		}
		this.currentStatus = new Status(active);
	}

	/**
	 * Initiate state machine execution.
	 * 
	 * @throws ModelException
	 *             in case there is a fatal SCXML object model problem.
	 */
	public void go() throws ModelException {
		// same as reset
		this.reset();
	}

	/**
	 * Get the environment specific error reporter.
	 * 
	 * @return Returns the errorReporter.
	 */
	public ErrorReporter getErrorReporter() {
		return errorReporter;
	}

	/**
	 * Set the environment specific error reporter.
	 * 
	 * @param errorReporter
	 *            The errorReporter to set.
	 */
	public void setErrorReporter(final ErrorReporter errorReporter) {
		this.errorReporter = errorReporter;
	}

	/**
	 * Get the event dispatcher.
	 * 
	 * @return Returns the eventdispatcher.
	 */
	public EventDispatcher getEventdispatcher() {
		return eventdispatcher;
	}

	/**
	 * Set the event dispatcher.
	 * 
	 * @param eventdispatcher
	 *            The eventdispatcher to set.
	 */
	public void setEventdispatcher(final EventDispatcher eventdispatcher) {
		this.eventdispatcher = eventdispatcher;
	}

	/**
	 * Use &quot;super-step&quot;, default is <code>true</code> (that is,
	 * run-to-completion is default).
	 * 
	 * @return Returns the superStep property.
	 * @see #setSuperStep(boolean)
	 */
	public boolean isSuperStep() {
		return superStep;
	}

	/**
	 * Set the super step.
	 * 
	 * @param superStep
	 *            if true, the internal derived events are also processed
	 *            (run-to-completion); if false, the internal derived events are
	 *            stored in the CurrentStatus property and processed within the
	 *            next triggerEvents() invocation, also the immediate (empty
	 *            event) transitions are deferred until the next step
	 */
	public void setSuperStep(final boolean superStep) {
		this.superStep = superStep;
	}

	/**
	 * Add a listener to the {@link Observable}.
	 * 
	 * @param observable
	 *            The {@link Observable} to attach the listener to.
	 * @param listener
	 *            The SCXMLListener.
	 */
	public void addListener(final Observable observable, final SCXMLListener listener) {
		scInstance.getNotificationRegistry().addListener(observable, listener);
	}

	/**
	 * Remove this listener from the {@link Observable}.
	 * 
	 * @param observable
	 *            The {@link Observable}.
	 * @param listener
	 *            The SCXMLListener to be removed.
	 */
	public void removeListener(final Observable observable, final SCXMLListener listener) {
		scInstance.getNotificationRegistry().removeListener(observable, listener);
	}

	/**
	 * Register an <code>Invoker</code> for this target type.
	 * 
	 * @param type
	 *            The target type (specified by "type" attribute of
	 *            &lt;invoke&gt; tag).
	 * @param invokerClass
	 *            The <code>Invoker</code> <code>Class</code>.
	 */
	public void registerInvokerClass(final String type, final Class<? extends Invoker> invokerClass) {
		scInstance.registerInvokerClass(type, invokerClass);
	}

	/**
	 * Remove the <code>Invoker</code> registered for this target type (if there
	 * is one registered).
	 * 
	 * @param type
	 *            The target type (specified by "type" attribute of
	 *            &lt;invoke&gt; tag).
	 */
	public void unregisterInvokerClass(final String type) {
		scInstance.unregisterInvokerClass(type);
	}

	/**
	 * Get the state chart instance for this executor.
	 * 
	 * @return The SCInstance for this executor.
	 */
	public SCInstance getSCInstance() {
		return scInstance;
	}

	/**
	 * Log the current set of active states.
	 */
	private void logState() {
		if (log.isDebugEnabled()) {
			StringBuffer sb = new StringBuffer("Current States: [ ");
			for (TransitionTarget tt : currentStatus.getStates()) {
				sb.append(tt.getId()).append(", ");
			}
			int length = sb.length();
			sb.delete(length - 2, length).append(" ]");
			log.debug(sb.toString());
		}
	}

	/**
	 * @param step
	 *            The most recent Step
	 */
	private void updateStatus(final Step step) {
		currentStatus = step.getAfterStatus();
		scInstance.getRootContext().setLocal("_ALL_STATES", SCXMLHelper.getAncestorClosure(currentStatus.getStates(), null));
		setEventData(currentStatus.getEvents().toArray(new TriggerEvent[0]));
	}

	/**
	 * @param evts
	 *            The events being triggered.
	 * @return Object[] Previous values.
	 */
	private Object[] setEventData(final TriggerEvent[] evts) {
		Context rootCtx = scInstance.getRootContext();
		Object[] oldData = { rootCtx.get(EVENT_DATA), rootCtx.get(EVENT_DATA_MAP) };
		int len = evts.length;
		if (len > 0) { // 0 has retry semantics (eg: see usage in reset())
			Object eventData = null;
			Map<String, Object> payloadMap = new HashMap<String, Object>();
			for (TriggerEvent te : evts) {
				payloadMap.put(te.getName(), te.getPayload());
			}
			if (len == 1) {
				// we have only one event
				eventData = evts[0].getPayload();
			}
			rootCtx.setLocal(EVENT_DATA, eventData);
			rootCtx.setLocal(EVENT_DATA_MAP, payloadMap);
		}
		return oldData;
	}

	/**
	 * @param oldData
	 *            The old values to restore to.
	 */
	private void restoreEventData(final Object[] oldData) {
		scInstance.getRootContext().setLocal(EVENT_DATA, oldData[0]);
		scInstance.getRootContext().setLocal(EVENT_DATA_MAP, oldData[1]);
	}

	/**
	 * The special variable for storing single event data / payload.
	 */
	private static final String EVENT_DATA = "_eventdata";

	/**
	 * The special variable for storing event data / payload, when multiple
	 * events are triggered, keyed by event name.
	 */
	private static final String EVENT_DATA_MAP = "_eventdatamap";

	/**
	 * SCXMLExecutor put into motion without setting a model (state machine).
	 */
	private static final String ERR_NO_STATE_MACHINE = "SCXMLExecutor: State machine not set";

}
