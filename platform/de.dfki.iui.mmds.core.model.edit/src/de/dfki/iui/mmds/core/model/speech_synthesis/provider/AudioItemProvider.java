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
package de.dfki.iui.mmds.core.model.speech_synthesis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.speech_synthesis.Audio;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AudioItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFetchhintPropertyDescriptor(object);
			addFetchtimeoutPropertyDescriptor(object);
			addMaxagePropertyDescriptor(object);
			addMaxstalePropertyDescriptor(object);
			addSrcPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fetchhint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFetchhintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Audio_fetchhint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Audio_fetchhint_feature", "_UI_Audio_type"),
				 SpeechSynthesisPackage.Literals.AUDIO__FETCHHINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fetchtimeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFetchtimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Audio_fetchtimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Audio_fetchtimeout_feature", "_UI_Audio_type"),
				 SpeechSynthesisPackage.Literals.AUDIO__FETCHTIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maxage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Audio_maxage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Audio_maxage_feature", "_UI_Audio_type"),
				 SpeechSynthesisPackage.Literals.AUDIO__MAXAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maxstale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxstalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Audio_maxstale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Audio_maxstale_feature", "_UI_Audio_type"),
				 SpeechSynthesisPackage.Literals.AUDIO__MAXSTALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Src feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Audio_src_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Audio_src_feature", "_UI_Audio_type"),
				 SpeechSynthesisPackage.Literals.AUDIO__SRC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpeechSynthesisPackage.Literals.AUDIO__MIXED);
			childrenFeatures.add(SpeechSynthesisPackage.Literals.AUDIO__ANY_ATTRIBUTE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Audio.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Audio"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Audio)object).getFetchhint();
		return label == null || label.length() == 0 ?
			getString("_UI_Audio_type") :
			getString("_UI_Audio_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Audio.class)) {
			case SpeechSynthesisPackage.AUDIO__FETCHHINT:
			case SpeechSynthesisPackage.AUDIO__FETCHTIMEOUT:
			case SpeechSynthesisPackage.AUDIO__MAXAGE:
			case SpeechSynthesisPackage.AUDIO__MAXSTALE:
			case SpeechSynthesisPackage.AUDIO__SRC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpeechSynthesisPackage.AUDIO__MIXED:
			case SpeechSynthesisPackage.AUDIO__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__AUDIO,
					 SpeechSynthesisFactory.eINSTANCE.createAudio())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__BREAK,
					 SpeechSynthesisFactory.eINSTANCE.createBreak())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__EMPHASIS,
					 SpeechSynthesisFactory.eINSTANCE.createEmphasis())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__LANG,
					 SpeechSynthesisFactory.eINSTANCE.createLangType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__MARK,
					 SpeechSynthesisFactory.eINSTANCE.createMark1())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__PHONEME,
					 SpeechSynthesisFactory.eINSTANCE.createPhoneme())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__PROSODY,
					 SpeechSynthesisFactory.eINSTANCE.createProsody())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__SAY_AS,
					 SpeechSynthesisFactory.eINSTANCE.createSayAs())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__SUB,
					 SpeechSynthesisFactory.eINSTANCE.createSub())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__TOKEN,
					 SpeechSynthesisFactory.eINSTANCE.createTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__VOICE,
					 SpeechSynthesisFactory.eINSTANCE.createVoice())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__W,
					 SpeechSynthesisFactory.eINSTANCE.createTokenType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__P,
					 SpeechSynthesisFactory.eINSTANCE.createParagraph())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.SSML__S,
					 SpeechSynthesisFactory.eINSTANCE.createSentence())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.AUDIO__LOOKUP,
					 SpeechSynthesisFactory.eINSTANCE.createLookupType())));

		newChildDescriptors.add
			(createChildParameter
				(SpeechSynthesisPackage.Literals.AUDIO__MIXED,
				 FeatureMapUtil.createEntry
					(SpeechSynthesisPackage.Literals.AUDIO__DESC,
					 SpeechSynthesisFactory.eINSTANCE.createDesc())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == SpeechSynthesisPackage.Literals.SSML__TOKEN ||
			childFeature == SpeechSynthesisPackage.Literals.SSML__W;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SiamEditPlugin.INSTANCE;
	}

}
