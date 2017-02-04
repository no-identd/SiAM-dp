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

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Dialog Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getText <em>Text</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAbstractDialogBox()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractDialogBox extends UIElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAbstractDialogBox_Title()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getTitle();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(BString value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(BString)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAbstractDialogBox_Text()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getText();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(BString value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(BBoolean)
	 * @see de.dfki.iui.mmds.core.model.io.gui.GuiPackage#getAbstractDialogBox_Visible()
	 * @model default="false" dataType="de.dfki.iui.mmds.core.model.base.BBoolean"
	 * @generated
	 */
	BBoolean getVisible();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.gui.AbstractDialogBox#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(BBoolean value);

} // AbstractDialogBox
