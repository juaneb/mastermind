package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
