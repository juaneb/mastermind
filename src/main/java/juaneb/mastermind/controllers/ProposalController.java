package main.java.juaneb.mastermind.controllers;

import java.util.List;

import main.java.juaneb.mastermind.types.Color;
import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.mastermind.models.Session;

public abstract class ProposalController extends AcceptorController {



	public ProposalController(Session session) {
		super(session);	
	}

	public abstract Error addProposedCombination(List<Color> colors); 

	public abstract boolean isWinner();

	public abstract boolean isLooser();
	
	public abstract int getAttempts();

	public abstract List<Color> getColors(int position);

	public abstract int getBlacks(int position);

	public abstract int getWhites(int position);

	public abstract void undo();

	public abstract boolean undoable();

	public abstract void redo();

	public abstract boolean redoable(); 

	public abstract void register();

	public abstract void continueState();
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}



}
