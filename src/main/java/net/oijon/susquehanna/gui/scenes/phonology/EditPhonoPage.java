package net.oijon.susquehanna.gui.scenes.phonology;

import java.time.Instant;

import javafx.scene.control.Label;
import net.oijon.susquehanna.App;
import net.oijon.susquehanna.gui.components.PhonemeTable;
import net.oijon.susquehanna.gui.resources.Fonts;
import net.oijon.susquehanna.gui.scenes.OnePageBook;
import net.oijon.susquehanna.gui.toolboxes.PhonologyTools;
import net.oijon.oling.datatypes.language.Language;

public class EditPhonoPage extends OnePageBook {

	public EditPhonoPage() {
		super();
		id = "phono.edit";
		toolbox = new PhonologyTools();
		refresh();
	}
	
	@Override
	public void updateOnLanguageChange() {
		super.updateOnLanguageChange();
		refresh();
	}
	
	@Override
	public void refresh() {
		log.debug("Started loading edit phono page at " + Instant.now());
		if (hasViewablePhono()) {
			buildViewable();
		} else {
			buildNonViewable();
		}
		log.debug("Finished loading edit phono page at " + Instant.now());
	}

	private void buildViewable() {
		clear();
		
		Label phonoLabel = new Label("Phonology");
		phonoLabel.setFont(Fonts.OPENSANS_BOLD);
		PhonemeTable table = new PhonemeTable(App.getSelectedLang().getPhono(), true);
		
		addToLeft(phonoLabel);
		addToLeft(table);
	}
	
	private void buildNonViewable() {
		clear();
		
		Label noLangViewPhono = new Label("Could not display phonology."
				+ " Either no language is selected, or the phonology is invalid.");
		
		addToLeft(noLangViewPhono);
		
	}
	
	private boolean hasViewablePhono() {
		if (App.getSelectedLang() == Language.NULL) {
			return false;
		} else {
			return true;
		}
	}

}
