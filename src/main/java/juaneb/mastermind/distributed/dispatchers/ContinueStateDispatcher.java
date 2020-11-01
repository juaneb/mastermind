package main.java.juaneb.mastermind.distributed.dispatchers;

import main.java.juaneb.mastermind.controllers.ProposalController;

public class ContinueStateDispatcher extends Dispatcher {

    public ContinueStateDispatcher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {
		((ProposalController)this.acceptorController).continueState();
	}
    
}