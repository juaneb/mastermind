package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;

public abstract class Controller {

	protected Game game;

	Controller(Game game) {
		this.game = game;
	}

}
