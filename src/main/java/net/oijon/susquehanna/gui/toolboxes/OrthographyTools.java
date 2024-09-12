package net.oijon.susquehanna.gui.toolboxes;

import net.oijon.susquehanna.gui.components.ToolButton;
import net.oijon.susquehanna.gui.resources.Backgrounds;
import net.oijon.susquehanna.gui.scenes.orthography.EditOrthographyPage;
import net.oijon.susquehanna.gui.scenes.orthography.ViewOrthographyPage;

public class OrthographyTools extends Toolbox {

	public OrthographyTools() {
		super(Backgrounds.ORTHOGRAPHYTOOLS);
		
		ToolButton viewOrthography = new ToolButton("View\nOrthography");
        ToolButton editOrthography = new ToolButton("Edit\nOrthography");
        ToolButton script = new ToolButton("Script");
        
        // transfer actions
        viewOrthography.createTransferAction("ortho.view");
        editOrthography.createTransferAction("ortho.edit");
        
        this.getChildren().addAll(viewOrthography, editOrthography, script);
        
	}
	
}
