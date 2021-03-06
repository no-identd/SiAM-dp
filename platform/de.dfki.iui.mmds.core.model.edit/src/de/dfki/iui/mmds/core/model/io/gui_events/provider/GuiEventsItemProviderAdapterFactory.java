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
package de.dfki.iui.mmds.core.model.io.gui_events.provider;

import de.dfki.iui.mmds.core.model.io.gui_events.util.GuiEventsAdapterFactory;
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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiEventsItemProviderAdapterFactory extends GuiEventsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public GuiEventsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickEventItemProvider clickEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.ClickEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClickEventAdapter() {
		if (clickEventItemProvider == null) {
			clickEventItemProvider = new ClickEventItemProvider(this);
		}

		return clickEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DblClickEventItemProvider dblClickEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.DblClickEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDblClickEventAdapter() {
		if (dblClickEventItemProvider == null) {
			dblClickEventItemProvider = new DblClickEventItemProvider(this);
		}

		return dblClickEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseDownEventItemProvider mouseDownEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseDownEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMouseDownEventAdapter() {
		if (mouseDownEventItemProvider == null) {
			mouseDownEventItemProvider = new MouseDownEventItemProvider(this);
		}

		return mouseDownEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseMoveEventItemProvider mouseMoveEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseMoveEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMouseMoveEventAdapter() {
		if (mouseMoveEventItemProvider == null) {
			mouseMoveEventItemProvider = new MouseMoveEventItemProvider(this);
		}

		return mouseMoveEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseOverEventItemProvider mouseOverEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOverEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMouseOverEventAdapter() {
		if (mouseOverEventItemProvider == null) {
			mouseOverEventItemProvider = new MouseOverEventItemProvider(this);
		}

		return mouseOverEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseOutEventItemProvider mouseOutEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseOutEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMouseOutEventAdapter() {
		if (mouseOutEventItemProvider == null) {
			mouseOutEventItemProvider = new MouseOutEventItemProvider(this);
		}

		return mouseOutEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseUpEventItemProvider mouseUpEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.MouseUpEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMouseUpEventAdapter() {
		if (mouseUpEventItemProvider == null) {
			mouseUpEventItemProvider = new MouseUpEventItemProvider(this);
		}

		return mouseUpEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyPressEventItemProvider keyPressEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.KeyPressEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyPressEventAdapter() {
		if (keyPressEventItemProvider == null) {
			keyPressEventItemProvider = new KeyPressEventItemProvider(this);
		}

		return keyPressEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyUpEventItemProvider keyUpEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.KeyUpEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyUpEventAdapter() {
		if (keyUpEventItemProvider == null) {
			keyUpEventItemProvider = new KeyUpEventItemProvider(this);
		}

		return keyUpEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyDownEventItemProvider keyDownEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.KeyDownEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyDownEventAdapter() {
		if (keyDownEventItemProvider == null) {
			keyDownEventItemProvider = new KeyDownEventItemProvider(this);
		}

		return keyDownEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeEventItemProvider changeEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.ChangeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeEventAdapter() {
		if (changeEventItemProvider == null) {
			changeEventItemProvider = new ChangeEventItemProvider(this);
		}

		return changeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlurEventItemProvider blurEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.BlurEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlurEventAdapter() {
		if (blurEventItemProvider == null) {
			blurEventItemProvider = new BlurEventItemProvider(this);
		}

		return blurEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FocusEventItemProvider focusEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.FocusEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFocusEventAdapter() {
		if (focusEventItemProvider == null) {
			focusEventItemProvider = new FocusEventItemProvider(this);
		}

		return focusEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectTextEventItemProvider selectTextEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.SelectTextEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectTextEventAdapter() {
		if (selectTextEventItemProvider == null) {
			selectTextEventItemProvider = new SelectTextEventItemProvider(this);
		}

		return selectTextEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmitEventItemProvider submitEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.SubmitEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubmitEventAdapter() {
		if (submitEventItemProvider == null) {
			submitEventItemProvider = new SubmitEventItemProvider(this);
		}

		return submitEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogEventItemProvider dialogEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.gui_events.DialogEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDialogEventAdapter() {
		if (dialogEventItemProvider == null) {
			dialogEventItemProvider = new DialogEventItemProvider(this);
		}

		return dialogEventItemProvider;
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
		if (clickEventItemProvider != null) clickEventItemProvider.dispose();
		if (dblClickEventItemProvider != null) dblClickEventItemProvider.dispose();
		if (mouseDownEventItemProvider != null) mouseDownEventItemProvider.dispose();
		if (mouseMoveEventItemProvider != null) mouseMoveEventItemProvider.dispose();
		if (mouseOverEventItemProvider != null) mouseOverEventItemProvider.dispose();
		if (mouseOutEventItemProvider != null) mouseOutEventItemProvider.dispose();
		if (mouseUpEventItemProvider != null) mouseUpEventItemProvider.dispose();
		if (keyPressEventItemProvider != null) keyPressEventItemProvider.dispose();
		if (keyUpEventItemProvider != null) keyUpEventItemProvider.dispose();
		if (keyDownEventItemProvider != null) keyDownEventItemProvider.dispose();
		if (changeEventItemProvider != null) changeEventItemProvider.dispose();
		if (blurEventItemProvider != null) blurEventItemProvider.dispose();
		if (focusEventItemProvider != null) focusEventItemProvider.dispose();
		if (selectTextEventItemProvider != null) selectTextEventItemProvider.dispose();
		if (submitEventItemProvider != null) submitEventItemProvider.dispose();
		if (dialogEventItemProvider != null) dialogEventItemProvider.dispose();
	}

}
