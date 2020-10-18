package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.models.ProposedCombination;
import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.utils.WithConsoleView;

class ProposalView extends  WithConsoleView {	
	
	private Logic logic;
	private SecretCombinationView secretCombinationView;

	public ProposalView(Logic logic){
		this.logic = logic;
		this.secretCombinationView = new SecretCombinationView();
	}	

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.logic.addProposedCombination(proposedCombination);
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.logic.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.logic.getAttempts(); i++) {
			new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
			new ResultView(this.logic.getResult(i)).writeln();
		}
		if (this.logic.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.logic.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
