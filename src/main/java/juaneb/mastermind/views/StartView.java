package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.utils.WithConsoleView;

class StartView extends WithConsoleView {
	
	private SecretCombinationView secretCombinationView;
	
	void interact(StartController startController) {
		startController.start();
		this.console.writeln(MessageView.TITLE.getMessage());
		this.secretCombinationView = new SecretCombinationView(startController);
		this.secretCombinationView.writeln();				
	}

}
