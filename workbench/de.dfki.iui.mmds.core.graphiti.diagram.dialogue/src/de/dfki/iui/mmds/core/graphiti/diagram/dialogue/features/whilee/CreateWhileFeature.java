package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.features.whilee;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.BoUtil;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.DialogueImageProvider;
import de.dfki.iui.mmds.core.graphiti.diagram.dialogue.util.PropertyUtil;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.FlowchartFactory;
import de.dfki.iui.mmds.core.model.dialogue.flowchart.While;

/**
 *  Class for creating model content of type {@link While}. The appropriate pictogram content is added by the add feature.
 * 
 * @author Dragan Milchevski
 *
 */
public class CreateWhileFeature  extends AbstractCreateFeature implements ICreateFeature{

	/**
	 * Creates new {@link CreateWhileFeature}
	 * @param fp the feature provider.
	 */
	public CreateWhileFeature(IFeatureProvider fp) {
		super(fp, "While", "Create new While");
	}
	
	/**
	 * Check if the object can be created.
	 * 
	 * @param context the creating context
	 * @return true if the context can be created
	 */
	@Override
	public boolean canCreate(ICreateContext context) {
		return BoUtil.canCreateNode(context);
	}

	/**
	 * Create new {@link While}. First get the container shape of the target object
	 * and check if is of the allowed instances create the {@link While} inside.
	 * 
	 * @param context the context
	 * @return the newly created objects
	 */
	@Override
	public Object[] create(ICreateContext context) {
		final While newWhile = FlowchartFactory.eINSTANCE.createWhile();
		
		ContainerShape container = context.getTargetContainer();
		PictogramLink link = container.getLink();

		EList<EObject> bos = link.getBusinessObjects();
		if(!bos.isEmpty()){
			for(EObject bo : bos){
				if(BoUtil.addEObjectToParent(bo, newWhile, container)){
					break;
				}
			}
		}
		// do the add

		addGraphicalRepresentation(context, newWhile);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return new Object[] { newWhile };
	}

	/**
	 * Get the icon for the {@link While} from the Image provider class.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return DialogueImageProvider.IMG_WHILE;
	}
	
	/**
	 * This method is overridden for the purpose of classifying the create features in the palate.
	 * 
	 * @param context this is the general input for this method
	 * @return true if it is available, false if not
	 */
	@Override
	public boolean isAvailable(IContext context){
		if(context.getProperty(PropertyUtil.PACKAGE_KEY).equals(PropertyUtil.FLOW_CHART_PACKAGE_VALUE)){
			return true;
		}
		return false;
	}

}
