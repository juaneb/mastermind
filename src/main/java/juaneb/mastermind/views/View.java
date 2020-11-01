package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.Controller;
import main.java.juaneb.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public void interact(Controller controller) {
		controller.accept(this);
	}

}
