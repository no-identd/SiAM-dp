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
package de.dfki.iui.mmds.core.model.io.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.iui.mmds.core.model.base.provider.EntityItemProvider;
import de.dfki.iui.mmds.core.model.base.provider.SiamEditPlugin;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.ServiceInstance;

/**
 * This is the item provider adapter for a {@link de.dfki.iui.mmds.core.model.io.ServiceInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceInstanceItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addDevicePropertyDescriptor(object);
			addUsedHardwarePropertyDescriptor(object);
			addServiceInstanceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInstance_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInstance_description_feature", "_UI_ServiceInstance_type"),
				 IoPackage.Literals.SERVICE_INSTANCE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Device feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInstance_device_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInstance_device_feature", "_UI_ServiceInstance_type"),
				 IoPackage.Literals.SERVICE_INSTANCE__DEVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used Hardware feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedHardwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInstance_usedHardware_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInstance_usedHardware_feature", "_UI_ServiceInstance_type"),
				 IoPackage.Literals.SERVICE_INSTANCE__USED_HARDWARE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInstance_serviceInstanceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInstance_serviceInstanceName_feature", "_UI_ServiceInstance_type"),
				 IoPackage.Literals.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME,
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
			childrenFeatures.add(IoPackage.Literals.SERVICE_INSTANCE__COMMUNICATIONINFO);
			childrenFeatures.add(IoPackage.Literals.SERVICE_INSTANCE__SERVICES);
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
	 * This returns ServiceInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceInstance"));
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
		String label = ((ServiceInstance)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceInstance_type") :
			getString("_UI_ServiceInstance_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceInstance.class)) {
			case IoPackage.SERVICE_INSTANCE__DESCRIPTION:
			case IoPackage.SERVICE_INSTANCE__SERVICE_INSTANCE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IoPackage.SERVICE_INSTANCE__COMMUNICATIONINFO:
			case IoPackage.SERVICE_INSTANCE__SERVICES:
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
				(IoPackage.Literals.SERVICE_INSTANCE__COMMUNICATIONINFO,
				 IoFactory.eINSTANCE.createTCPServer()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.SERVICE_INSTANCE__COMMUNICATIONINFO,
				 IoFactory.eINSTANCE.createTECSDirectService()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.SERVICE_INSTANCE__COMMUNICATIONINFO,
				 IoFactory.eINSTANCE.createHtmlServlet()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.SERVICE_INSTANCE__COMMUNICATIONINFO,
				 IoFactory.eINSTANCE.createSipConnection()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.SERVICE_INSTANCE__COMMUNICATIONINFO,
				 IoFactory.eINSTANCE.createOSGIBundle()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.SERVICE_INSTANCE__SERVICES,
				 IoFactory.eINSTANCE.createCompoundService()));

		newChildDescriptors.add
			(createChildParameter
				(IoPackage.Literals.SERVICE_INSTANCE__SERVICES,
				 IoFactory.eINSTANCE.createSimpleService()));
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
