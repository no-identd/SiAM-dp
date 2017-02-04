/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.core.model.pattern.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.dfki.iui.mmds.core.model.pattern.util.PatternAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternItemProviderAdapterFactory extends PatternAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PObjectItemProvider pObjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPObjectAdapter() {
		if (pObjectItemProvider == null) {
			pObjectItemProvider = new PObjectItemProvider(this);
		}

		return pObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PSlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSlotItemProvider pSlotItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSlotAdapter() {
		if (pSlotItemProvider == null) {
			pSlotItemProvider = new PSlotItemProvider(this);
		}

		return pSlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PValueItemProvider pValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPValueAdapter() {
		if (pValueItemProvider == null) {
			pValueItemProvider = new PValueItemProvider(this);
		}

		return pValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PValueObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PValueObjectItemProvider pValueObjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPValueObjectAdapter() {
		if (pValueObjectItemProvider == null) {
			pValueObjectItemProvider = new PValueObjectItemProvider(this);
		}

		return pValueObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PRestrictions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRestrictionsItemProvider pRestrictionsItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PRestrictions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPRestrictionsAdapter() {
		if (pRestrictionsItemProvider == null) {
			pRestrictionsItemProvider = new PRestrictionsItemProvider(this);
		}

		return pRestrictionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PBooleanRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PBooleanRestrictionItemProvider pBooleanRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PBooleanRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPBooleanRestrictionAdapter() {
		if (pBooleanRestrictionItemProvider == null) {
			pBooleanRestrictionItemProvider = new PBooleanRestrictionItemProvider(this);
		}

		return pBooleanRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PEnumRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PEnumRestrictionItemProvider pEnumRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PEnumRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPEnumRestrictionAdapter() {
		if (pEnumRestrictionItemProvider == null) {
			pEnumRestrictionItemProvider = new PEnumRestrictionItemProvider(this);
		}

		return pEnumRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PCharRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCharRestrictionItemProvider pCharRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PCharRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPCharRestrictionAdapter() {
		if (pCharRestrictionItemProvider == null) {
			pCharRestrictionItemProvider = new PCharRestrictionItemProvider(this);
		}

		return pCharRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PStringRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PStringRestrictionItemProvider pStringRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PStringRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPStringRestrictionAdapter() {
		if (pStringRestrictionItemProvider == null) {
			pStringRestrictionItemProvider = new PStringRestrictionItemProvider(this);
		}

		return pStringRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PByteRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PByteRestrictionItemProvider pByteRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PByteRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPByteRestrictionAdapter() {
		if (pByteRestrictionItemProvider == null) {
			pByteRestrictionItemProvider = new PByteRestrictionItemProvider(this);
		}

		return pByteRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PShortRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PShortRestrictionItemProvider pShortRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PShortRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPShortRestrictionAdapter() {
		if (pShortRestrictionItemProvider == null) {
			pShortRestrictionItemProvider = new PShortRestrictionItemProvider(this);
		}

		return pShortRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PDateRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDateRestrictionItemProvider pDateRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PDateRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPDateRestrictionAdapter() {
		if (pDateRestrictionItemProvider == null) {
			pDateRestrictionItemProvider = new PDateRestrictionItemProvider(this);
		}

		return pDateRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PFloatRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFloatRestrictionItemProvider pFloatRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PFloatRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPFloatRestrictionAdapter() {
		if (pFloatRestrictionItemProvider == null) {
			pFloatRestrictionItemProvider = new PFloatRestrictionItemProvider(this);
		}

		return pFloatRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PDoubleRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDoubleRestrictionItemProvider pDoubleRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PDoubleRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPDoubleRestrictionAdapter() {
		if (pDoubleRestrictionItemProvider == null) {
			pDoubleRestrictionItemProvider = new PDoubleRestrictionItemProvider(this);
		}

		return pDoubleRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PLongRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLongRestrictionItemProvider pLongRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PLongRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPLongRestrictionAdapter() {
		if (pLongRestrictionItemProvider == null) {
			pLongRestrictionItemProvider = new PLongRestrictionItemProvider(this);
		}

		return pLongRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PIntegerRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIntegerRestrictionItemProvider pIntegerRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PIntegerRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPIntegerRestrictionAdapter() {
		if (pIntegerRestrictionItemProvider == null) {
			pIntegerRestrictionItemProvider = new PIntegerRestrictionItemProvider(this);
		}

		return pIntegerRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PSubscription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSubscriptionItemProvider pSubscriptionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PSubscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSubscriptionAdapter() {
		if (pSubscriptionItemProvider == null) {
			pSubscriptionItemProvider = new PSubscriptionItemProvider(this);
		}

		return pSubscriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PEmptySlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PEmptySlotItemProvider pEmptySlotItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PEmptySlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPEmptySlotAdapter() {
		if (pEmptySlotItemProvider == null) {
			pEmptySlotItemProvider = new PEmptySlotItemProvider(this);
		}

		return pEmptySlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.pattern.PLogicalFormula} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLogicalFormulaItemProvider pLogicalFormulaItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.pattern.PLogicalFormula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPLogicalFormulaAdapter() {
		if (pLogicalFormulaItemProvider == null) {
			pLogicalFormulaItemProvider = new PLogicalFormulaItemProvider(this);
		}

		return pLogicalFormulaItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (pEmptySlotItemProvider != null) pEmptySlotItemProvider.dispose();
		if (pLogicalFormulaItemProvider != null) pLogicalFormulaItemProvider.dispose();
		if (pObjectItemProvider != null) pObjectItemProvider.dispose();
		if (pSlotItemProvider != null) pSlotItemProvider.dispose();
		if (pSubscriptionItemProvider != null) pSubscriptionItemProvider.dispose();
		if (pValueItemProvider != null) pValueItemProvider.dispose();
		if (pValueObjectItemProvider != null) pValueObjectItemProvider.dispose();
		if (pRestrictionsItemProvider != null) pRestrictionsItemProvider.dispose();
		if (pBooleanRestrictionItemProvider != null) pBooleanRestrictionItemProvider.dispose();
		if (pEnumRestrictionItemProvider != null) pEnumRestrictionItemProvider.dispose();
		if (pCharRestrictionItemProvider != null) pCharRestrictionItemProvider.dispose();
		if (pStringRestrictionItemProvider != null) pStringRestrictionItemProvider.dispose();
		if (pByteRestrictionItemProvider != null) pByteRestrictionItemProvider.dispose();
		if (pShortRestrictionItemProvider != null) pShortRestrictionItemProvider.dispose();
		if (pIntegerRestrictionItemProvider != null) pIntegerRestrictionItemProvider.dispose();
		if (pLongRestrictionItemProvider != null) pLongRestrictionItemProvider.dispose();
		if (pFloatRestrictionItemProvider != null) pFloatRestrictionItemProvider.dispose();
		if (pDoubleRestrictionItemProvider != null) pDoubleRestrictionItemProvider.dispose();
		if (pDateRestrictionItemProvider != null) pDateRestrictionItemProvider.dispose();
	}

}
