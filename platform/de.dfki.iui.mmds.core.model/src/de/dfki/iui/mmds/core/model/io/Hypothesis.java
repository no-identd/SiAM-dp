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
package de.dfki.iui.mmds.core.model.io;

import de.dfki.iui.mmds.core.model.base.BObject;

import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.Hypothesis#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.Hypothesis#getCommunicativeFunction <em>Communicative Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getHypothesis()
 * @model
 * @generated
 */
public interface Hypothesis extends BObject {
	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(float)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getHypothesis_Confidence()
	 * @model default="1"
	 * @generated
	 */
	float getConfidence();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.Hypothesis#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(float value);

	/**
	 * Returns the value of the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicative Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicative Function</em>' containment reference.
	 * @see #setCommunicativeFunction(CommunicativeFunction)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getHypothesis_CommunicativeFunction()
	 * @model containment="true"
	 * @generated
	 */
	CommunicativeFunction getCommunicativeFunction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.Hypothesis#getCommunicativeFunction <em>Communicative Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communicative Function</em>' containment reference.
	 * @see #getCommunicativeFunction()
	 * @generated
	 */
	void setCommunicativeFunction(CommunicativeFunction value);

} // Hypothesis
