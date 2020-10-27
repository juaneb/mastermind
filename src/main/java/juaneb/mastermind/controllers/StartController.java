package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;

public class StartController extends Controller implements AcceptorController{

	public StartController(Session session) {
		super(session);
	}
	
	public void start() {		
		this.session.getState().next();
	}
	
	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}



}
