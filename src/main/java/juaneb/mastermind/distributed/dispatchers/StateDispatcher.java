package main.java.juaneb.mastermind.distributed.dispatchers;

import main.java.juaneb.mastermind.controllers.ProposalController;

public class StateDispatcher extends Dispatcher {

	public StateDispatcher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(this.acceptorController.getValueState().ordinal());
	}

}
