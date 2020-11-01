package main.java.juaneb.mastermind.distributed.dispatchers.undoredo;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

	public RedoDispatcher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {
		((ProposalController)this.acceptorController).redo();
	}

}
