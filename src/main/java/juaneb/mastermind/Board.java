package main.java.juaneb.mastermind;

import main.java.juaneb.utils.Console;


class Board {

	private final int MAX_ATTEMPS = 10;	
	private int attempts;
	private Result[] results;
	protected SecretCombination secretCombination;
	protected ProposedCombination[] proposedCombinations;

	Board() {

		this.results = new Result[this.MAX_ATTEMPS];
		this.attempts = 0;
	}

	void write() {
		Console.instance().writeln();
		Message.ATTEMPTS.writeln(this.attempts);
		this.secretCombination.writeln();		
		for (int i = 0; i < this.attempts; i++) {
			this.proposedCombinations[i].write();
			this.results[i].writeln();
		}
	}

	boolean isSuperedNumAttemptes() {
		return this.attempts < this.MAX_ATTEMPS;
	}

	boolean isCombinationGuess() {		
		return this.results[this.attempts-1].isWinner();
	}

}
