package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;


import main.java.juaneb.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	void interact(ProposalController proposalController) {
		new PlayMenu(proposalController).execute();
		
	}

}
