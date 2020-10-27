package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController{

	public ResumeController(Session session) {
		super(session);
	  }
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.session.getGame().clear();
			this.session.getState().reset();
		} else {
			this.session.getState().next();
		}
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
