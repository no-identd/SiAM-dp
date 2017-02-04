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
package org.apache.commons.scxml.env.jexl;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.Script;
import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.w3c.dom.Node;

/**
 * Evaluator implementation enabling use of JEXL expressions in SCXML documents.
 * 
 */
public class JexlEvaluator implements Evaluator, Serializable {

	/** Serial version UID. */
	private static final long serialVersionUID = 1L;

	/** Error message if evaluation context is not a JexlContext. */
	private static final String ERR_CTX_TYPE = "Error evaluating JEXL " + "expression, Context must be a org.apache.commons.jexl.JexlContext";

	/** Pattern for recognizing the SCXML In() special predicate. */
	private static Pattern inFct = Pattern.compile("In\\(");
	/** Pattern for recognizing the Commons SCXML Data() builtin function. */
	private static Pattern dataFct = Pattern.compile("Data\\(");

	JexlEngine jexlEngine = new JexlEngine();

	/** Constructor. */
	public JexlEvaluator() {
		super();
		jexlEngine.setSilent(false);
		jexlEngine.setStrict(false);
	}

	/**
	 * Evaluate an expression.
	 * 
	 * @param ctx
	 *            variable context
	 * @param expr
	 *            expression
	 * @return a result of the evaluation
	 * @throws SCXMLExpressionException
	 *             For a malformed expression
	 * @see Evaluator#eval(Context, String)
	 */
	@Override
	public Object eval(final Context ctx, final String expr) throws SCXMLExpressionException {
		if (expr == null)
			return null;
		JexlContext jexlCtx = null;
		if (ctx instanceof JexlContext) {
			jexlCtx = (JexlContext) ctx;
		} else
			throw new SCXMLExpressionException(ERR_CTX_TYPE);
		Expression exp = null;
		try {
			String evalExpr = inFct.matcher(expr).replaceAll("_builtin.isMember(_ALL_STATES, ");
			evalExpr = dataFct.matcher(evalExpr).replaceAll("_builtin.data(_ALL_NAMESPACES, ");
			exp = jexlEngine.createExpression(evalExpr);
			return exp.evaluate(getEffectiveContext(jexlCtx));
		} catch (Exception e) {
			throw new SCXMLExpressionException("eval('" + expr + "'):" + e.getMessage(), e);
		}
	}

	/**
	 * @see Evaluator#evalCond(Context, String)
	 */
	@Override
	public Boolean evalCond(final Context ctx, final String expr) throws SCXMLExpressionException {
		if (expr == null)
			return null;
		JexlContext jexlCtx = null;
		if (ctx instanceof JexlContext) {
			jexlCtx = (JexlContext) ctx;
		} else
			throw new SCXMLExpressionException(ERR_CTX_TYPE);
		Expression exp = null;
		try {
			String evalExpr = inFct.matcher(expr).replaceAll("_builtin.isMember(_ALL_STATES, ");
			evalExpr = dataFct.matcher(evalExpr).replaceAll("_builtin.data(_ALL_NAMESPACES, ");
			exp = jexlEngine.createExpression(evalExpr);
			return (Boolean) exp.evaluate(getEffectiveContext(jexlCtx));
		} catch (Exception e) {
			e.printStackTrace();
			throw new SCXMLExpressionException("evalCond('" + expr + "'):" + e.getMessage(), e);
		}
	}

	/**
	 * @see Evaluator#evalLocation(Context, String)
	 */
	@Override
	public Node evalLocation(final Context ctx, final String expr) throws SCXMLExpressionException {
		if (expr == null)
			return null;
		JexlContext jexlCtx = null;
		if (ctx instanceof JexlContext) {
			jexlCtx = (JexlContext) ctx;
		} else
			throw new SCXMLExpressionException(ERR_CTX_TYPE);
		Expression exp = null;
		try {
			String evalExpr = inFct.matcher(expr).replaceAll("_builtin.isMember(_ALL_STATES, ");
			evalExpr = dataFct.matcher(evalExpr).replaceFirst("_builtin.dataNode(_ALL_NAMESPACES, ");
			evalExpr = dataFct.matcher(evalExpr).replaceAll("_builtin.data(_ALL_NAMESPACES, ");
			exp = jexlEngine.createExpression(evalExpr);
			return (Node) exp.evaluate(getEffectiveContext(jexlCtx));
		} catch (Exception e) {
			throw new SCXMLExpressionException("evalLocation('" + expr + "'):" + e.getMessage(), e);
		}
	}

	/**
	 * @see Evaluator#evalScript(Context, String)
	 */
	@Override
	public Object evalScript(Context ctx, String script) throws SCXMLExpressionException {
		if (script == null)
			return null;
		JexlContext jexlCtx = null;
		if (ctx instanceof JexlContext) {
			jexlCtx = (JexlContext) ctx;
		} else
			throw new SCXMLExpressionException(ERR_CTX_TYPE);
		Script jexlScript = null;
		try {
			String scriptStr = inFct.matcher(script).replaceAll("_builtin.isMember(_ALL_STATES, ");
			scriptStr = dataFct.matcher(scriptStr).replaceAll("_builtin.data(_ALL_NAMESPACES, ");
			jexlScript = jexlEngine.createScript(scriptStr);
			return jexlScript.execute(getEffectiveContext(jexlCtx));
		} catch (Exception e) {
			throw new SCXMLExpressionException("evalScript('" + script + "'):" + e.getMessage(), e);
		}
	}

	/**
	 * Create a new child context.
	 * 
	 * @param parent
	 *            parent context
	 * @return new child context
	 * @see Evaluator#newContext(Context)
	 */
	@Override
	public Context newContext(final Context parent) {
		return new JexlContext(parent);
	}

	/**
	 * Create a new context which is the summation of contexts from the current
	 * state to document root, child has priority over parent in scoping rules.
	 * 
	 * @param nodeCtx
	 *            The JexlContext for this state.
	 * @return The effective JexlContext for the path leading up to document
	 *         root.
	 */
	protected JexlContext getEffectiveContext(final JexlContext nodeCtx) {
		return new JexlContext(new EffectiveContextMap(nodeCtx));
	}

	/**
	 * The map that will back the effective context for the
	 * {@link JexlEvaluator}. The effective context enables the chaining of
	 * {@link Context}s all the way from the current state node to the root.
	 * 
	 */
	private static final class EffectiveContextMap extends AbstractMap<String, Object> {

		/** The {@link Context} for the current state. */
		final Context leaf;

		/** Constructor. */
		public EffectiveContextMap(JexlContext ctx) {
			super();
			this.leaf = ctx;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Set<Map.Entry<String, Object>> entrySet() {
			Set<Map.Entry<String, Object>> entrySet = new HashSet<Map.Entry<String, Object>>();
			Context current = leaf;
			while (current != null) {
				entrySet.addAll(current.getVars().entrySet());
				current = current.getParent();
			}
			return entrySet;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Object put(String key, Object value) {
			Object old = leaf.get(key);
			if (leaf.has(key)) {
				leaf.set(key, value);
			} else {
				leaf.setLocal(key, value);
			}
			return old;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Object get(Object key) {
			Context current = leaf;
			while (current != null) {
				if (current.getVars().containsKey(key))
					return current.getVars().get(key);
				current = current.getParent();
			}
			return null;
		}

	}

}
