package de.dfki.iui.mmds.core.graphiti.diagram.dialogue.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import de.dfki.iui.mmds.core.model.dialogue.statechart.StateChart;

public class DialogueNodeFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pictogramElement) {
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pictogramElement);
		if (bo instanceof StateChart) {
			return true;
		}
		return false;
	}

}
