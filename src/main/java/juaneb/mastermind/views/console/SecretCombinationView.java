package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.Controller;
import main.java.juaneb.mastermind.views.MessageView;
import main.java.juaneb.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {
	
	private Controller controller;
	
	SecretCombinationView(Controller controller) {
		super();
		this.controller = controller;
	}
	
	void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
