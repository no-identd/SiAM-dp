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
package de.dfki.iui.mmds.core.model.io.tangible.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.model.io.tangible.PushButtonInput;
import de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Button Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.PushButtonInputImpl#isIsPressed <em>Is Pressed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.tangible.impl.PushButtonInputImpl#isCanNotifyRelease <em>Can Notify Release</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushButtonInputImpl extends TangibleInputImpl implements PushButtonInput {
	/**
	 * The default value of the '{@link #isIsPressed() <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPressed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPressed() <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPressed()
	 * @generated
	 * @ordered
	 */
	protected boolean isPressed = IS_PRESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanNotifyRelease() <em>Can Notify Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanNotifyRelease()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_NOTIFY_RELEASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanNotifyRelease() <em>Can Notify Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanNotifyRelease()
	 * @generated
	 * @ordered
	 */
	protected boolean canNotifyRelease = CAN_NOTIFY_RELEASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushButtonInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TangiblePackage.Literals.PUSH_BUTTON_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPressed() {
		return isPressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPressed(boolean newIsPressed) {
		boolean oldIsPressed = isPressed;
		isPressed = newIsPressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.PUSH_BUTTON_INPUT__IS_PRESSED, oldIsPressed, isPressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanNotifyRelease() {
		return canNotifyRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanNotifyRelease(boolean newCanNotifyRelease) {
		boolean oldCanNotifyRelease = canNotifyRelease;
		canNotifyRelease = newCanNotifyRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TangiblePackage.PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE, oldCanNotifyRelease, canNotifyRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TangiblePackage.PUSH_BUTTON_INPUT__IS_PRESSED:
				return isIsPressed();
			case TangiblePackage.PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE:
				return isCanNotifyRelease();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TangiblePackage.PUSH_BUTTON_INPUT__IS_PRESSED:
				setIsPressed((Boolean)newValue);
				return;
			case TangiblePackage.PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE:
				setCanNotifyRelease((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TangiblePackage.PUSH_BUTTON_INPUT__IS_PRESSED:
				setIsPressed(IS_PRESSED_EDEFAULT);
				return;
			case TangiblePackage.PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE:
				setCanNotifyRelease(CAN_NOTIFY_RELEASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TangiblePackage.PUSH_BUTTON_INPUT__IS_PRESSED:
				return isPressed != IS_PRESSED_EDEFAULT;
			case TangiblePackage.PUSH_BUTTON_INPUT__CAN_NOTIFY_RELEASE:
				return canNotifyRelease != CAN_NOTIFY_RELEASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isPressed: ");
		result.append(isPressed);
		result.append(", canNotifyRelease: ");
		result.append(canNotifyRelease);
		result.append(')');
		return result.toString();
	}

} //PushButtonInputImpl
