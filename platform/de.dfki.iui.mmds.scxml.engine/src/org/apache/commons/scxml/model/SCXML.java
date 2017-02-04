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
package org.apache.commons.scxml.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.scxml.SCXMLHelper;

/**
 * The class in this SCXML object model that corresponds to the
 * &lt;scxml&gt; root element, and serves as the &quot;document
 * root&quot;.
 *
 */
public class SCXML implements Serializable, Observable,
                              NamespacePrefixesHolder, IParentState {

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 2L;

    /**
     * The SCXML XMLNS.
     */
    public static final String XMLNS = "http://www.w3.org/2005/07/scxml";

    /**
     * The xmlns attribute on the root &lt;smxml&gt; element.
     * This must match XMLNS above.
     */
    private String xmlns;

    /**
     * The SCXML version of this document.
     */
    private String version;

    /**
     * The initial TransitionTarget for the SCXML executor.
     */
    private TransitionTarget initialTarget;

    /**
     * The initial transition target ID (used by XML Digester only).
     */
    private String initial;

    /**
     * The id for this state machine.
     */
    private String id;

    /**
     * The profile in use.
     */
    private String profile;

    /**
     * The exmode for this document.
     */
    private String exmode;

    /**
     * Optional property holding the data model for this SCXML document.
     * This gets merged with the root context and potentially hides any
     * (namesake) variables in the root context.
     */
    private Datamodel datamodel;

    /**
     * The immediate child targets of this SCXML document root.
     */
    private final Map<String, TransitionTarget> children;

    /**
     * A global map of all States and Parallels associated with this
     * state machine, keyed by their id.
     */
    private final Map<String, TransitionTarget> targets;

    /**
     * The XML namespaces defined on the SCXML document root node,
     * preserved primarily for serialization.
     */
    private Map<String, String> namespaces;

    /**
     * Constructor.
     */
    public SCXML() {
        this.children = new LinkedHashMap<String, TransitionTarget>();
        this.targets = new HashMap<String, TransitionTarget>();
    }

    /**
     * Get the initial TransitionTarget.
     *
     * @return Returns the initial target for this state machine.
     *
     * @since 0.7
     */
    public final TransitionTarget getInitialTarget() {
        return initialTarget;
    }

    /**
     * Set the initial TransitionTarget.
     *
     * @param initialTarget The initial target to set.
     *
     * @since 0.7
     */
    public final void setInitialTarget(final TransitionTarget initialTarget) {
        this.initialTarget = initialTarget;
    }

    /**
     * Get the data model placed at document root.
     *
     * @return Returns the data model.
     */
    public final Datamodel getDatamodel() {
        return datamodel;
    }

    /**
     * Set the data model at document root.
     *
     * @param datamodel The Datamodel to set.
     */
    public final void setDatamodel(final Datamodel datamodel) {
        this.datamodel = datamodel;
    }

    /**
     * Get the immediate child targets of the SCXML root.
     *
     * @return Map Returns map of the child targets.
     *
     * @since 0.7
     */
    public final Map<String, TransitionTarget> getChildren() {
        return children;
    }

    /**
     * Add an immediate child target of the SCXML root.
     *
     * @param tt The transition target to be added to the states Map.
     *
     * @since 0.7
     */
    public final void addChild(final TransitionTarget tt) {
        children.put(tt.getId(), tt);
    }

    /**
     * Get the targets map, which is a Map of all States and Parallels
     * associated with this state machine, keyed by their id.
     *
     * @return Map Returns the targets.
     */
    public final Map<String, TransitionTarget> getTargets() {
        return targets;
    }

    /**
     * Add a target to this SCXML document.
     *
     * @param target The target to be added to the targets Map.
     */
    public final void addTarget(final TransitionTarget target) {
        String id = target.getId();
        if (!SCXMLHelper.isStringEmpty(id)) {
            // Target is not anonymous, so makes sense to map it
            targets.put(id, target);
        }
    }

    /**
     * Get the SCXML document version.
     *
     * @return Returns the version.
     */
    public final String getVersion() {
        return version;
    }

    /**
     * Set the SCXML document version.
     *
     * @param version The version to set.
     */
    public final void setVersion(final String version) {
        this.version = version;
    }

    /**
     * Get the xmlns of this SCXML document.
     *
     * @return Returns the xmlns.
     */
    public final String getXmlns() {
        return xmlns;
    }

    /**
     * Set the xmlns of this SCXML document.
     *
     * @param xmlns The xmlns to set.
     */
    public final void setXmlns(final String xmlns) {
        this.xmlns = xmlns;
    }

    /**
     * Get the namespace definitions specified on the SCXML element.
     * May be <code>null</code>.
     *
     * @return The namespace definitions specified on the SCXML element,
     *         may be <code>null</code>.
     */
    @Override
	public final Map<String, String> getNamespaces() {
        return namespaces;
    }

    /**
     * Set the namespace definitions specified on the SCXML element.
     *
     * @param namespaces The namespace definitions specified on the
     *                   SCXML element.
     */
    @Override
	public final void setNamespaces(final Map<String, String> namespaces) {
        this.namespaces = namespaces;
    }

    /**
     * Get the ID of the initial transition target.
     *
     * @return String Returns the initial transition target ID
     *     (used by XML Digester only).
     * @see #getInitialTarget()
     */
    public final String getInitial() {
        return initial;
    }

    /**
     * Set the ID of the initial transition target.
     *
     * @param initial The initial transition target ID
     *     (used by XML Digester only).
     * @see #setInitialTarget(TransitionTarget)
     */
    public final void setInitial(final String initial) {
        this.initial = initial;
    }

    /**
     * Get the name for this state machine.
     *
     * @return The name for this state machine.
     */
	public String getId() {
		return id;
	}

	/**
	 * Set the name for this state machine.
	 *
	 * @param name The name for this state machine.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the profile in use for this state machine.
	 *
	 * @return The profile in use.
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * Set the profile in use for this state machine.
	 *
	 * @param profile The profile to be used.
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * Get the exmode in use for this state machine.
	 *
	 * @return The exmode in use.
	 */
	public String getExmode() {
		return exmode;
	}

	/**
	 * Set the exmode to be used for this state machine.
	 *
	 * @param exmode The exmode to be used.
	 */
	public void setExmode(String exmode) {
		this.exmode = exmode;
	}

    /**
     * Get the map of child states (may be empty).
     *
     * @return Map Returns the children.
     */
    @Override
	public final Map<String, TransitionTarget> getSubStates() {
        return children;
    }

	
}

