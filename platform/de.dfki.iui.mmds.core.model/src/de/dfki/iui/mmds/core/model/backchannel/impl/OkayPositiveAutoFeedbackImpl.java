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
package de.dfki.iui.mmds.core.model.backchannel.impl;

import de.dfki.iui.mmds.core.model.backchannel.BackchannelPackage;
import de.dfki.iui.mmds.core.model.backchannel.OkayPositiveAutoFeedback;

import de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAutoFeedbackImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Okay Positive Auto Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OkayPositiveAutoFeedbackImpl extends PositiveInterpretationAutoFeedbackImpl implements OkayPositiveAutoFeedback {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OkayPositiveAutoFeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BackchannelPackage.Literals.OKAY_POSITIVE_AUTO_FEEDBACK;
	}

} //OkayPositiveAutoFeedbackImpl
