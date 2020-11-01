package main.java.juaneb.mastermind.distributed.dispatchers.undoredo;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

	public UndoDispatcher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {
		((ProposalController)this.acceptorController).undo();
	}

}
