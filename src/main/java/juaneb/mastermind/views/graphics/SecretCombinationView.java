package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.models.SecretCombination;
import main.java.juaneb.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

	SecretCombinationView() {
		super();
	}

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
