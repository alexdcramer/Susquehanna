package net.oijon.susquehanna.gui.toolboxes;

import net.oijon.susquehanna.gui.components.ToolButton;
import net.oijon.susquehanna.gui.resources.Backgrounds;

public class LexiconTools extends Toolbox {

	public LexiconTools() {
		super(Backgrounds.LEXICONTOOLS);
		
		ToolButton viewWords = new ToolButton("View Words");
        ToolButton editWords = new ToolButton("Edit Words");
        
        viewWords.createTransferAction("lexicon.view");
        editWords.createTransferAction("lexicon.edit");
        
        this.getChildren().addAll(viewWords, editWords);
	}

}
