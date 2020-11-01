package main.java.juaneb.mastermind.controllers.implementation;

import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	private SessionImplementation sessionImplementation;

	public ResumeControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void resume(boolean newGame) {
		if (newGame) {
			this.sessionImplementation.getGame().clear();
			this.sessionImplementation.getState().reset();
		} else {
			this.sessionImplementation.getState().next();
		}
	}

}
