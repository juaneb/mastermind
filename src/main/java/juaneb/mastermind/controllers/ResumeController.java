package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.State;

public class ResumeController extends Controller {

	public ResumeController(Game game, State state) {
		super(game, state);
	}
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.game.clear();
			this.state.reset();
		} else {
			this.state.next();
		}
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
