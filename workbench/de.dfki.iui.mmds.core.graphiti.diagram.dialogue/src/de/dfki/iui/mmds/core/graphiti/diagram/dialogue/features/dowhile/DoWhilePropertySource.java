package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.dowhile;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import de.dfki.iui.mmds.core.model.dialogue.flowchart.DoWhile;

/**
 * {@link DoWhilePropertySource} class capable of supplying properties for 
 * display by the standard property sheet page implementation ({@link PropertySheetPage}) for the objects of type {@link DoWhile}
 * 
 * @author Dragan Milchevski
 *
 */
public class DoWhilePropertySource implements IPropertySource{

	private static final String NAME = "name";
	private static final String ID = "id";
	private static final String CONDITION = "condition";
	private static final PropertyDescriptor NAME_PROP_DESC = new TextPropertyDescriptor(NAME, "Name");
	private static final PropertyDescriptor ID_PROP_DESC = new TextPropertyDescriptor(ID, "Id");
	private static final PropertyDescriptor COND_PROP_DESC = new TextPropertyDescriptor(CONDITION, "Condition");
	private static final IPropertyDescriptor[] DESCRIPTORS = { NAME_PROP_DESC, ID_PROP_DESC, COND_PROP_DESC };
	
	private DoWhile doWhile;
	
	/**
	 * Creates new {@link DoWhilePropertySource}
	 * @param doWhile
	 */
	public DoWhilePropertySource(DoWhile doWhile){
		this.doWhile = doWhile;
	}
	
	/**
	 * Returns a value for this property source that can be edited in a property sheet. 
	 * 
	 * @return a value that can be edited
	 */
	@Override
	public Object getEditableValue() {
		
		return this;
	}

	/**
	 * Returns the list of property descriptors for this property source. 
	 * The getPropertyValue and setPropertyValue methods are used to read and write 
	 * the actual property values by specifying the property ids from these property descriptors.
	 * 
	 *  @return the property descriptors
	 */
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return DESCRIPTORS;
	}

	/**
	 * Returns the value of the property with the given id if it has one. 
	 * Returns null if the property's value is null value or if this source does not have the specified property.
	 * 
	 * @param id the id of the property being set
	 * @return the value of the property, or null
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (NAME.equals(id)) {
			if(doWhile.getDisplayName() != null){
				return doWhile.getDisplayName();
			}else{
				return "";
			}
		}else if(ID.equals(id)){
			if(doWhile.getId() != null){
				return doWhile.getId();
			}else{
				return "";
			}
		}else if(CONDITION.equals(id)){
			if(doWhile.getCondition() != null){
				return doWhile.getCondition();
			}else{
				return "";
			}
		}

		return null;
	}

	/**
	 * Returns whether the value of the property with the given id has changed from its default value. 
	 * Returns false if this source does not have the specified property. 
	 * If the notion of default value is not meaningful for the specified property then false is returned.
	 * 
	 * @param id the id of the property
	 * @return true if the value of the specified property has changed from its original default value, 
	 * false if the specified property does not have a meaningful default value, and false if this source does not have the specified property
	 */
	@Override
	public boolean isPropertySet(Object id) {
		if (NAME.equals(id)) {
			return true;
		} else if(ID.equals(id)){
			return true;
		} else if(CONDITION.equals(id)){
			return true;
		}
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Returns whether the value of the property with the given id has changed from its default value. 
	 * Returns false if this source does not have the specified property. 
	 * If the notion of default value is not meaningful for the specified property then false is returned.
	 * 
	 * @param id the id of the property
	 * @return true if the value of the specified property has changed from its original default value, 
	 * false if the specified property does not have a meaningful default value, and false if this source does not have the specified property
	 */
	@Override
	public void setPropertyValue(final Object id, final Object value) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(doWhile);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				if (NAME.equals(id)) {
					doWhile.setDisplayName((String)value);
				}else if(ID.equals(id)){
					doWhile.setId((String)value);
				}else if(CONDITION.equals(id)){
					doWhile.setCondition((String)value);
				}
			}
		});
		
	}

}
