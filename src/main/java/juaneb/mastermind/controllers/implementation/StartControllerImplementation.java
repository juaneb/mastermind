package main.java.juaneb.mastermind.controllers.implementation;

import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

	private SessionImplementation sessionImplementation;

	public StartControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	@Override
	public void start() {
		this.sessionImplementation.next();		
	}

}
