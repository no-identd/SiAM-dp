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
package de.dfki.iui.mmds.core.interfaces;

import java.util.List;

import de.dfki.iui.mmds.core.model.io.gui.AbstractContainer;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;

public interface IDisplaxContextService {

	public abstract GUIApplication getCurrentDisplayContext(String deviceId);

	public abstract void sendCurrentDisplayContent(String id);

	public abstract List<String> getDeviceList();

	public abstract UIElement findUiElement(AbstractContainer container, String id);

}