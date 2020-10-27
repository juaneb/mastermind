package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.mastermind.views.MessageView;
import main.java.juaneb.mastermind.types.Color;


import java.util.List;

class PlayCommand extends Command {

  PlayCommand(ProposalController proposalController) {
    super(MessageView.ACTION_COMMAND.getMessage(), proposalController);
  }

  @Override
  protected void execute() {
    Error error;
		do {
			List<Color> colors = new ProposedCombinationView(proposalController).read();
			error = proposalController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		proposalController.register();
		//this.console.writeln();
		new AttemptsView(proposalController).writeln();
		new SecretCombinationView(proposalController).writeln();
		for (int i = 0; i < proposalController.getAttempts(); i++) {
			new ProposedCombinationView(proposalController).write(i);
			new ResultView(proposalController).writeln(i);
		}
		if (proposalController.isWinner()) {
			//this.console.writeln(MessageView.WINNER.getMessage());
		} else if (proposalController.isLooser()) {
			//this.console.writeln(MessageView.LOOSER.getMessage());
		}
  }  

  @Override
  protected boolean isActive() {
    return true;
  }

}
