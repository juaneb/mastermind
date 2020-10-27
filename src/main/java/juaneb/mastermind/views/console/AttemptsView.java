package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.views.MessageView;
import main.java.juaneb.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

	private ProposalController proposalController;

	AttemptsView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}

	void writeln() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.proposalController.getAttempts()));
	}

}
