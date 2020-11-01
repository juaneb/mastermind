package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.mastermind.types.StateValue;

public abstract class Controller {

	protected Session session;

	Controller(Session session) {
		this.session = session;
	}
	
	public int getWidth() {
		return this.session.getWidth();		
	}	

	public StateValue getValueState() {
		return this.session.getValueState();
	}

}
