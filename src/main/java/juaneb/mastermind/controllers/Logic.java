package main.java.juaneb.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import main.java.juaneb.mastermind.types.StateValue;
import main.java.juaneb.mastermind.models.Session;

public class Logic {
	
	protected Session session;	
	protected Map<StateValue, AcceptorController> controllers;
		
	protected Logic() {			
		this.controllers = new HashMap<StateValue, AcceptorController>();	
	}
	
	public AcceptorController getController() {
		return this.controllers.get(this.session.getValueState());
	}
	
}
