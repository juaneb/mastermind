package main.java.juaneb.mastermind;

import java.util.HashMap;
import java.util.Map;

import main.java.juaneb.mastermind.models.StateValue;
import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.State;

import main.java.juaneb.mastermind.controllers.Controller;
import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;


public class Mastermind {
	
	private State state;	
	private Game game;
	private Map<StateValue, Controller> controllers;
	
	protected Mastermind() {
		this.state = new State();
		this.game = new Game();
		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
		this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.game, this.state));
		this.controllers.put(StateValue.EXIT, null);
	}
	

	protected void play() {
		Controller controller;
		do {			
			controller = this.controllers.get(this.state.getValueState());
			if (controller != null){
				controller.control();
			}
		} while (controller != null); 
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}
	
}

