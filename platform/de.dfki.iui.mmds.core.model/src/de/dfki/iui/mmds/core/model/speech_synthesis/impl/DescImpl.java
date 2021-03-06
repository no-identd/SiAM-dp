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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import de.dfki.iui.mmds.core.model.speech_synthesis.Desc;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl#getOnlangfailure <em>Onlangfailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescImpl extends MinimalEObjectImpl.Container implements Desc {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlangfailure() <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlangfailure()
	 * @generated
	 * @ordered
	 */
	protected static final String ONLANGFAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlangfailure() <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlangfailure()
	 * @generated
	 * @ordered
	 */
	protected String onlangfailure = ONLANGFAILURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpeechSynthesisPackage.Literals.DESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpeechSynthesisPackage.DESC__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SpeechSynthesisPackage.Literals.DESC__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.DESC__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnlangfailure() {
		return onlangfailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlangfailure(String newOnlangfailure) {
		String oldOnlangfailure = onlangfailure;
		onlangfailure = newOnlangfailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpeechSynthesisPackage.DESC__ONLANGFAILURE, oldOnlangfailure, onlangfailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SpeechSynthesisPackage.DESC__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpeechSynthesisPackage.DESC__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.DESC__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SpeechSynthesisPackage.DESC__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpeechSynthesisPackage.DESC__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpeechSynthesisPackage.DESC__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SpeechSynthesisPackage.DESC__LANG:
				return getLang();
			case SpeechSynthesisPackage.DESC__ONLANGFAILURE:
				return getOnlangfailure();
			case SpeechSynthesisPackage.DESC__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case SpeechSynthesisPackage.DESC__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpeechSynthesisPackage.DESC__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SpeechSynthesisPackage.DESC__LANG:
				setLang((String)newValue);
				return;
			case SpeechSynthesisPackage.DESC__ONLANGFAILURE:
				setOnlangfailure((String)newValue);
				return;
			case SpeechSynthesisPackage.DESC__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case SpeechSynthesisPackage.DESC__MIXED:
				getMixed().clear();
				return;
			case SpeechSynthesisPackage.DESC__ANY:
				getAny().clear();
				return;
			case SpeechSynthesisPackage.DESC__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SpeechSynthesisPackage.DESC__ONLANGFAILURE:
				setOnlangfailure(ONLANGFAILURE_EDEFAULT);
				return;
			case SpeechSynthesisPackage.DESC__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case SpeechSynthesisPackage.DESC__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpeechSynthesisPackage.DESC__ANY:
				return !getAny().isEmpty();
			case SpeechSynthesisPackage.DESC__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SpeechSynthesisPackage.DESC__ONLANGFAILURE:
				return ONLANGFAILURE_EDEFAULT == null ? onlangfailure != null : !ONLANGFAILURE_EDEFAULT.equals(onlangfailure);
			case SpeechSynthesisPackage.DESC__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", lang: ");
		result.append(lang);
		result.append(", onlangfailure: ");
		result.append(onlangfailure);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DescImpl
