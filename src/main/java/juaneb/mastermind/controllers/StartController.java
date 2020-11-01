package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.State;

import main.java.juaneb.mastermind.views.SecretCombinationView;
import main.java.juaneb.mastermind.views.StartView;

public class StartController extends Controller {

	public StartController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void control() {
		this.state.next();
		new StartView().write();
		new SecretCombinationView(this).writeln();
	}

}
