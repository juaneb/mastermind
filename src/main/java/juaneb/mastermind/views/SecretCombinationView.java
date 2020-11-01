package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.Controller;
import main.java.juaneb.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {
	
	private Controller controller;
	
	public SecretCombinationView(Controller controller) {
		super();
		this.controller = controller;
	}
	
	public void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
