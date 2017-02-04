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
package de.dfki.iui.mmds.core.model.io.gui;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove UI Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement#getElementId <em>Element Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRemoveUIElement()
 * @model
 * @generated
 */
public interface RemoveUIElement extends UpdateInfo {
	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getRemoveUIElement_ElementId()
	 * @model default="" dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getElementId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(BString value);

} // RemoveUIElement
