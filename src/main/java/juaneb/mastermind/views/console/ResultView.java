package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.views.MessageView;
import main.java.juaneb.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private ProposalController proposalController;
	
	ResultView(ProposalController proposalController){
		this.proposalController = proposalController;
	}

	void writeln(int i) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.proposalController.getBlacks(i))
				.replaceFirst("#whites", "" + this.proposalController.getWhites(i)));
	}

}
