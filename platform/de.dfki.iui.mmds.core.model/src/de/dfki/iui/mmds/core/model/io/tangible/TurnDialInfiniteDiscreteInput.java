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
package de.dfki.iui.mmds.core.model.io.tangible;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Dial Infinite Discrete Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getTurnDialInfiniteDiscreteInput()
 * @model
 * @generated
 */
public interface TurnDialInfiniteDiscreteInput extends TangibleInput {
	/**
	 * Returns the value of the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta</em>' attribute.
	 * @see #setDelta(int)
	 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage#getTurnDialInfiniteDiscreteInput_Delta()
	 * @model
	 * @generated
	 */
	int getDelta();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.tangible.TurnDialInfiniteDiscreteInput#getDelta <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta</em>' attribute.
	 * @see #getDelta()
	 * @generated
	 */
	void setDelta(int value);

} // TurnDialInfiniteDiscreteInput
