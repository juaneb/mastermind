package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;

public abstract class ResumeController extends AcceptorController{

	public ResumeController(Session session) {
		super(session);
	  }
	

	public abstract void resume(boolean newGame);
	

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
