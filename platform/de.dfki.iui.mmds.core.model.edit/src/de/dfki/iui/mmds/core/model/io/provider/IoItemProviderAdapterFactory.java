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

import de.dfki.iui.mmds.core.model.io.util.IoAdapterFactory;
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
public class IoItemProviderAdapterFactory extends IoAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public IoItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.ServiceInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInstanceItemProvider serviceInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.ServiceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceInstanceAdapter() {
		if (serviceInstanceItemProvider == null) {
			serviceInstanceItemProvider = new ServiceInstanceItemProvider(this);
		}

		return serviceInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.CompoundService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundServiceItemProvider compoundServiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.CompoundService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompoundServiceAdapter() {
		if (compoundServiceItemProvider == null) {
			compoundServiceItemProvider = new CompoundServiceItemProvider(this);
		}

		return compoundServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.SimpleService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleServiceItemProvider simpleServiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.SimpleService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleServiceAdapter() {
		if (simpleServiceItemProvider == null) {
			simpleServiceItemProvider = new SimpleServiceItemProvider(this);
		}

		return simpleServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.TCPServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPServerItemProvider tcpServerItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.TCPServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCPServerAdapter() {
		if (tcpServerItemProvider == null) {
			tcpServerItemProvider = new TCPServerItemProvider(this);
		}

		return tcpServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.TECSDirectService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TECSDirectServiceItemProvider tecsDirectServiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.TECSDirectService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTECSDirectServiceAdapter() {
		if (tecsDirectServiceItemProvider == null) {
			tecsDirectServiceItemProvider = new TECSDirectServiceItemProvider(this);
		}

		return tecsDirectServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.HtmlServlet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HtmlServletItemProvider htmlServletItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.HtmlServlet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHtmlServletAdapter() {
		if (htmlServletItemProvider == null) {
			htmlServletItemProvider = new HtmlServletItemProvider(this);
		}

		return htmlServletItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.SipConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SipConnectionItemProvider sipConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.SipConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSipConnectionAdapter() {
		if (sipConnectionItemProvider == null) {
			sipConnectionItemProvider = new SipConnectionItemProvider(this);
		}

		return sipConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.OSGIBundle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSGIBundleItemProvider osgiBundleItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.OSGIBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOSGIBundleAdapter() {
		if (osgiBundleItemProvider == null) {
			osgiBundleItemProvider = new OSGIBundleItemProvider(this);
		}

		return osgiBundleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.IOEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOEventItemProvider ioEventItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.IOEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIOEventAdapter() {
		if (ioEventItemProvider == null) {
			ioEventItemProvider = new IOEventItemProvider(this);
		}

		return ioEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.CustomMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomMessageItemProvider customMessageItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.CustomMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomMessageAdapter() {
		if (customMessageItemProvider == null) {
			customMessageItemProvider = new CustomMessageItemProvider(this);
		}

		return customMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.UpdateDeviceMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateDeviceModeItemProvider updateDeviceModeItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.UpdateDeviceMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateDeviceModeAdapter() {
		if (updateDeviceModeItemProvider == null) {
			updateDeviceModeItemProvider = new UpdateDeviceModeItemProvider(this);
		}

		return updateDeviceModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.DeviceStateChanged} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStateChangedItemProvider deviceStateChangedItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.DeviceStateChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceStateChangedAdapter() {
		if (deviceStateChangedItemProvider == null) {
			deviceStateChangedItemProvider = new DeviceStateChangedItemProvider(this);
		}

		return deviceStateChangedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.InputAct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputActItemProvider inputActItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.InputAct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputActAdapter() {
		if (inputActItemProvider == null) {
			inputActItemProvider = new InputActItemProvider(this);
		}

		return inputActItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.OutputAct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputActItemProvider outputActItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.OutputAct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputActAdapter() {
		if (outputActItemProvider == null) {
			outputActItemProvider = new OutputActItemProvider(this);
		}

		return outputActItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.Hypothesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypothesisItemProvider hypothesisItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.Hypothesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHypothesisAdapter() {
		if (hypothesisItemProvider == null) {
			hypothesisItemProvider = new HypothesisItemProvider(this);
		}

		return hypothesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechHypothesisItemProvider speechHypothesisItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.SpeechHypothesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpeechHypothesisAdapter() {
		if (speechHypothesisItemProvider == null) {
			speechHypothesisItemProvider = new SpeechHypothesisItemProvider(this);
		}

		return speechHypothesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.GestureHypothesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestureHypothesisItemProvider gestureHypothesisItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.GestureHypothesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGestureHypothesisAdapter() {
		if (gestureHypothesisItemProvider == null) {
			gestureHypothesisItemProvider = new GestureHypothesisItemProvider(this);
		}

		return gestureHypothesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.PointingHypothesis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointingHypothesisItemProvider pointingHypothesisItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.PointingHypothesis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointingHypothesisAdapter() {
		if (pointingHypothesisItemProvider == null) {
			pointingHypothesisItemProvider = new PointingHypothesisItemProvider(this);
		}

		return pointingHypothesisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.CustomFormat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomFormatItemProvider customFormatItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.CustomFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomFormatAdapter() {
		if (customFormatItemProvider == null) {
			customFormatItemProvider = new CustomFormatItemProvider(this);
		}

		return customFormatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechRecognizerStateItemProvider speechRecognizerStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpeechRecognizerStateAdapter() {
		if (speechRecognizerStateItemProvider == null) {
			speechRecognizerStateItemProvider = new SpeechRecognizerStateItemProvider(this);
		}

		return speechRecognizerStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechRecognizerModeItemProvider speechRecognizerModeItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.SpeechRecognizerMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpeechRecognizerModeAdapter() {
		if (speechRecognizerModeItemProvider == null) {
			speechRecognizerModeItemProvider = new SpeechRecognizerModeItemProvider(this);
		}

		return speechRecognizerModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechSynthesisStateItemProvider speechSynthesisStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.SpeechSynthesisState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpeechSynthesisStateAdapter() {
		if (speechSynthesisStateItemProvider == null) {
			speechSynthesisStateItemProvider = new SpeechSynthesisStateItemProvider(this);
		}

		return speechSynthesisStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.ActiveGestures} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveGesturesItemProvider activeGesturesItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.ActiveGestures}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActiveGesturesAdapter() {
		if (activeGesturesItemProvider == null) {
			activeGesturesItemProvider = new ActiveGesturesItemProvider(this);
		}

		return activeGesturesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.Device} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceItemProvider deviceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceAdapter() {
		if (deviceItemProvider == null) {
			deviceItemProvider = new DeviceItemProvider(this);
		}

		return deviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.Hardware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareItemProvider hardwareItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.Hardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwareAdapter() {
		if (hardwareItemProvider == null) {
			hardwareItemProvider = new HardwareItemProvider(this);
		}

		return hardwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.CancelPresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CancelPresentationItemProvider cancelPresentationItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.CancelPresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCancelPresentationAdapter() {
		if (cancelPresentationItemProvider == null) {
			cancelPresentationItemProvider = new CancelPresentationItemProvider(this);
		}

		return cancelPresentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.PresentationState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationStateItemProvider presentationStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.PresentationState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresentationStateAdapter() {
		if (presentationStateItemProvider == null) {
			presentationStateItemProvider = new PresentationStateItemProvider(this);
		}

		return presentationStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dfki.iui.mmds.core.model.io.UpdateGrammar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateGrammarItemProvider updateGrammarItemProvider;

	/**
	 * This creates an adapter for a {@link de.dfki.iui.mmds.core.model.io.UpdateGrammar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateGrammarAdapter() {
		if (updateGrammarItemProvider == null) {
			updateGrammarItemProvider = new UpdateGrammarItemProvider(this);
		}

		return updateGrammarItemProvider;
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
		if (serviceInstanceItemProvider != null) serviceInstanceItemProvider.dispose();
		if (compoundServiceItemProvider != null) compoundServiceItemProvider.dispose();
		if (simpleServiceItemProvider != null) simpleServiceItemProvider.dispose();
		if (tcpServerItemProvider != null) tcpServerItemProvider.dispose();
		if (tecsDirectServiceItemProvider != null) tecsDirectServiceItemProvider.dispose();
		if (htmlServletItemProvider != null) htmlServletItemProvider.dispose();
		if (sipConnectionItemProvider != null) sipConnectionItemProvider.dispose();
		if (osgiBundleItemProvider != null) osgiBundleItemProvider.dispose();
		if (deviceItemProvider != null) deviceItemProvider.dispose();
		if (hardwareItemProvider != null) hardwareItemProvider.dispose();
		if (ioEventItemProvider != null) ioEventItemProvider.dispose();
		if (customMessageItemProvider != null) customMessageItemProvider.dispose();
		if (updateDeviceModeItemProvider != null) updateDeviceModeItemProvider.dispose();
		if (deviceStateChangedItemProvider != null) deviceStateChangedItemProvider.dispose();
		if (inputActItemProvider != null) inputActItemProvider.dispose();
		if (outputActItemProvider != null) outputActItemProvider.dispose();
		if (hypothesisItemProvider != null) hypothesisItemProvider.dispose();
		if (speechHypothesisItemProvider != null) speechHypothesisItemProvider.dispose();
		if (gestureHypothesisItemProvider != null) gestureHypothesisItemProvider.dispose();
		if (pointingHypothesisItemProvider != null) pointingHypothesisItemProvider.dispose();
		if (customFormatItemProvider != null) customFormatItemProvider.dispose();
		if (cancelPresentationItemProvider != null) cancelPresentationItemProvider.dispose();
		if (presentationStateItemProvider != null) presentationStateItemProvider.dispose();
		if (updateGrammarItemProvider != null) updateGrammarItemProvider.dispose();
		if (speechRecognizerStateItemProvider != null) speechRecognizerStateItemProvider.dispose();
		if (speechRecognizerModeItemProvider != null) speechRecognizerModeItemProvider.dispose();
		if (speechSynthesisStateItemProvider != null) speechSynthesisStateItemProvider.dispose();
		if (activeGesturesItemProvider != null) activeGesturesItemProvider.dispose();
	}

}