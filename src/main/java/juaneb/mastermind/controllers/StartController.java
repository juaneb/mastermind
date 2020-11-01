package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;

public abstract class StartController extends AcceptorController{

	public StartController(Session session) {
		super(session);
	}
	
	public abstract void start();
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}



}
