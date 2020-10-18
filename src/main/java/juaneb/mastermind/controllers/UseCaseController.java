package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.State;


public abstract class UseCaseController {

	protected Game game;
	protected State state;

	UseCaseController(Game game, State state) {
		this.game = game;
		this.state = state;
	}	

	public void next() {
		this.state.next();
	}

	public abstract void accept(ControllerVisitor controllerVisitor);

}
