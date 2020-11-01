package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.mastermind.models.SessionImplementation;

public class UndoController extends Controller {

  private SessionImplementation sessionImplementation;

  public UndoController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void undo() {
		this.sessionImplementation.undo();
	}

	public boolean undoable() {
		return this.sessionImplementation.undoable();
	}

}
