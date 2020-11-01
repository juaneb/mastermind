package main.java.juaneb.mastermind.distributed.dispatchers;

import main.java.juaneb.mastermind.controllers.ProposalController;

public class IsLooserDistpacher extends Dispatcher {

    public IsLooserDistpacher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((ProposalController)this.acceptorController).isLooser());
	}
    
}