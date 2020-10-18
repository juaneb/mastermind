package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.controllers.StartController;

class StartView  {

	private Logic logic;

	StartView(Logic logic) {
		assert logic != null;
		
		this.logic = logic;
	}	

	void interact(StartController startController) {
		MessageView.TITLE.writeln();		
		new SecretCombinationView().writeln();
	}

}
