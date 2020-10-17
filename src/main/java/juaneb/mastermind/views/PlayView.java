package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.models.*;
import main.java.juaneb.utils.WithConsoleView;



public class PlayView extends  WithConsoleView{

    private Board board;
	
	private SecretCombinationView secretCombinationView;

	PlayView(Board board) {
		this.board = board;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.board.add(proposedCombination);
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.board.getNumberAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.board.getNumberAttempts(); i++) {
			new ProposedCombinationView(this.board.getProposedCombination(i)).write();
			new ResultView(this.board.getResult(i)).writeln();
		}
		if (this.board.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.board.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
