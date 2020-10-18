package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.controllers.StartController;

class StartView  {

	private StartController startController;

	StartView(StartController startController) {
		assert startController != null;
		
		this.startController = startController;
	}

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
