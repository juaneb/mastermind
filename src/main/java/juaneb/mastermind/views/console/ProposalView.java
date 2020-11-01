package main.java.juaneb.mastermind.views.console;

import java.util.List;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.types.Color;
import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.mastermind.views.console.ErrorView;
import main.java.juaneb.utils.WithConsoleView;
import main.java.juaneb.mastermind.views.MessageView;

class ProposalView extends WithConsoleView {

	void interact(ProposalController proposalController) {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(proposalController).read();
			error = proposalController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
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
