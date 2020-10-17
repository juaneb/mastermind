package main.java.juaneb.mastermind.models;

public class Board {

  private static final int MAX_ATTEMPS = 10;
  private SecretCombination secretCombination;
  private ProposedCombination[] proposedCombinations;
  protected Result[] results;
  private int attempts;

  public Board() {
    this.secretCombination = new SecretCombination();
    this.proposedCombinations = new ProposedCombination[Board.MAX_ATTEMPS];
    this.results = new Result[Board.MAX_ATTEMPS];
    this.attempts = 0;
  }

  public void add(ProposedCombination proposedCombination) {
    this.proposedCombinations[this.attempts] = proposedCombination;
    this.results[this.attempts] = this.secretCombination.getResult(proposedCombination);
    this.attempts++;
  }

  public boolean isFinished() {
    return this.isWinner() || this.isLooser();
  }

  public boolean isWinner() {
    return this.results[this.attempts - 1].isWinner();
  }

  public boolean isLooser() {
    return this.attempts == Board.MAX_ATTEMPS;
  }

   public int getNumberAttempts() {
    return this.attempts;
  }

  public ProposedCombination getProposedCombination(int position) {
		return this.proposedCombinations[position];
  }
  
  public Result getResult(int position) {
		return this.results[position];
	}

}
