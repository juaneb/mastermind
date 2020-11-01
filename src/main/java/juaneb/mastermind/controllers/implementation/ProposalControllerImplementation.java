package main.java.juaneb.mastermind.controllers.implementation;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.RedoController;
import main.java.juaneb.mastermind.controllers.UndoController;
import main.java.juaneb.mastermind.controllers.ActionController;


import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.mastermind.models.Combination;

import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.mastermind.types.Color;
import java.util.List;


public class ProposalControllerImplementation extends ProposalController{

		public ActionController actionController;
		public UndoController undoController;
		public RedoController redoController;
	
		public ProposalControllerImplementation(Session session) {
			super(session);
			this.actionController = new ActionController(session);
			this.undoController = new UndoController(session);
			this.redoController = new RedoController(session);
		}
		
		@Override		
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
	
		@Override
		public boolean isWinner() {
			return this.session.getGame().isWinner();
		}
		
		@Override
		public boolean isLooser() {
			return this.session.getGame().isLooser();
		}
		
		@Override
		public int getAttempts() {
			return this.session.getGame().getAttempts();
		}
		
		@Override
		public List<Color> getColors(int position) {
			return this.session.getGame().getColors(position);
		}
		
		@Override
		public int getBlacks(int position) {
			return this.session.getGame().getBlacks(position);
		}
	
		@Override
		public int getWhites(int position) {
			return this.session.getGame().getWhites(position);
		}
	
		@Override
		public void undo() {
			this.undoController.undo();
		}
	
		@Override
		public boolean undoable() {
			return this.undoController.undoable();
		}
	
		@Override
		public void redo() {
			this.redoController.redo();
		}
	
		@Override
		public boolean redoable() {
			return this.redoController.redoable();
		}		

		@Override
		public void continueState() {
			//ver de qué manera puedo avanzar el estado....
			//this.session.next();
		}

	
		@Override
		public void register() {
			this.session.register();
		}
	

}
