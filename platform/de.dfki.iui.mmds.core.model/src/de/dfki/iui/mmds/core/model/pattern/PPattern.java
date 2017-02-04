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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PPattern#getVarName <em>Var Name</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PPattern#getInstIdx <em>Inst Idx</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PPattern#getQuantor <em>Quantor</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPPattern()
 * @model abstract="true"
 * @generated
 */
public interface PPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPPattern_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PPattern#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Inst Idx</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Idx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Idx</em>' attribute.
	 * @see #setInstIdx(int)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPPattern_InstIdx()
	 * @model default="-1"
	 * @generated
	 */
	int getInstIdx();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PPattern#getInstIdx <em>Inst Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Idx</em>' attribute.
	 * @see #getInstIdx()
	 * @generated
	 */
	void setInstIdx(int value);

	/**
	 * Returns the value of the '<em><b>Quantor</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.pattern.PQuantorEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantor</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.pattern.PQuantorEnum
	 * @see #setQuantor(PQuantorEnum)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPPattern_Quantor()
	 * @model
	 * @generated
	 */
	PQuantorEnum getQuantor();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PPattern#getQuantor <em>Quantor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantor</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.pattern.PQuantorEnum
	 * @see #getQuantor()
	 * @generated
	 */
	void setQuantor(PQuantorEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return Matches.matches(object, this).result == MatchResult.MATCH_SUCCESS;'"
	 * @generated
	 */
	boolean matches(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <CODE>createSkeleton()</CODE> is used to construct a skeleton for a PPattern. At the first mapping of a mapping chain
	 * usually there is no target content needed but can be constructed using the target PPattern. Based on that skeleton further
	 * mappings can rely on and set the corresponding features.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EObject createSkeleton();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PPattern unify(PPattern ppatt);

} // PPattern
