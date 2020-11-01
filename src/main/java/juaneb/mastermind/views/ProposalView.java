package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.ProposalController;

import main.java.juaneb.utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

	public void write(ProposalController proposalController) {

		this.console.writeln();
		new AttemptsView(proposalController).writeln();
		new SecretCombinationView(proposalController).writeln();
		for (int i = 0; i < proposalController.getAttempts(); i++) {
			new ProposedCombinationView(proposalController).write(i);
			new ResultView(proposalController).writeln(i);
		}
		if (proposalController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (proposalController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
	}

}
