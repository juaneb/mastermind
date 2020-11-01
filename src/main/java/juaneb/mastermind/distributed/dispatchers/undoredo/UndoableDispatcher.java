package main.java.juaneb.mastermind.distributed.dispatchers.undoredo;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.distributed.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {

	public UndoableDispatcher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((ProposalController)this.acceptorController).undoable());
	}

}
