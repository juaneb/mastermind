package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.models.*;
import main.java.juaneb.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    public SecretCombinationView() {
		super();
	}

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}    
}