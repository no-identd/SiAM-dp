/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
/**
 */
package de.dfki.iui.mmds.core.model.pattern;

import de.dfki.iui.mmds.core.emf.datatypes.BByte;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PByte Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PByteRestriction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPByteRestriction()
 * @model superTypes="de.dfki.iui.mmds.core.model.pattern.PNumberRestriction<de.dfki.iui.mmds.core.model.base.BByte>"
 * @generated
 */
public interface PByteRestriction extends PNumberRestriction<BByte> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BByte)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPByteRestriction_Value()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BByte"
	 * @generated
	 */
	BByte getValue();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PByteRestriction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BByte value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object newValue = value;\r\nif (value instanceof Byte || value instanceof de.dfki.iui.mmds.core.emf.datatypes.BByte) {\r\n\tnewValue = value instanceof Byte ? value : ((de.dfki.iui.mmds.core.emf.datatypes.BByte) value).getValue();\r\n\tint result = ((Byte) newValue).compareTo(getValue().getValue());\r\n\treturn _compareTo(result, getFunction());\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isSatisfiedBy(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( defVal != null ) {\r\n\treturn isSatisfiedBy( defVal ) ? defVal : null;\r\n}\r\n// create a value based on this restriction\r\nByte v = getValue().getValue();\r\nswitch ( getFunction() ) {\r\n\tcase EQUALS:\r\n\tcase GREATER_EQUALS:\r\n\tcase LESS_EQUALS:\r\n\t\treturn v;\r\n\tcase GREATER_THAN:\r\n\tcase NOT_EQUALS:\r\n\t\treturn ((Float) Math.nextAfter( v, Byte.MAX_VALUE)).byteValue();\r\n\tcase LESS_THAN:\r\n\t\treturn ((Float) Math.nextAfter( v, Byte.MIN_VALUE)).byteValue();\r\n\tdefault:\r\n\t\treturn null;\r\n}'"
	 * @generated
	 */
	Object getDefaultValue(Object defVal);

} // PByteRestriction
