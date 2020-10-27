package main.java.juaneb.mastermind.controllers;

import java.util.List;

import main.java.juaneb.mastermind.models.Combination;
import main.java.juaneb.mastermind.types.Color;
import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.mastermind.models.Session;

public class ProposalController extends Controller implements AcceptorController{

	public ActionController actionController;
	public UndoController undoController;
	public RedoController redoController;

	public ProposalController(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}

	public Error addProposedCombination(List<Color> colors) {
		Error error = null;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}				
			}
		}
		if (error == null){
			this.session.getGame().addProposedCombination(colors);
			if (this.session.getGame().isWinner() || this.session.getGame().isLooser()) {
				this.session.getState().next();
			}
		}
		return error;	
	}

	public boolean isWinner() {
		return this.session.getGame().isWinner();
	}

	public boolean isLooser() {
		return this.session.getGame().isLooser();
	}
	
	public int getAttempts() {
		return this.session.getGame().getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.session.getGame().getColors(position);
	}

	public int getBlacks(int position) {
		return this.session.getGame().getBlacks(position);
	}

	public int getWhites(int position) {
		return this.session.getGame().getWhites(position);
	}

	public void undo() {
		this.undoController.undo();
	}

	public boolean undoable() {
		return this.undoController.undoable();
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean redoable() {
		return this.redoController.redoable();
	}
	
	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

	public void register() {
		this.session.register();
	}

}
