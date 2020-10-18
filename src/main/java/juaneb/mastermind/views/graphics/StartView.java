package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.controllers.Logic;

class StartView  {

	private Logic logic;

	StartView(Logic logic) {
		assert logic != null;
		
		this.logic = logic;
	}

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
