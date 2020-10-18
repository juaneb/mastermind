package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.ProposedCombination;
import main.java.juaneb.mastermind.models.Result;

public class Logic {

  private Game game;
  private StartController startController;
  private ProposalController proposalController;
  private ResumeController resumeController;

  public Logic() {
    this.game = new Game();
    this.startController = new StartController(this.game);
    this.proposalController = new ProposalController(this.game);
    this.resumeController = new ResumeController(this.game);
  }

  public void resume() {
    this.resumeController.resume();
  }

  public void addProposedCombination(ProposedCombination proposedCombination) {    
    this.proposalController.addProposedCombination(proposedCombination);
  }
  
  public int getAttempts() {
		return this.proposalController.getAttempts();
  }
  
  public ProposedCombination getProposedCombination(int position) {
		return this.proposalController.getProposedCombination(position);
  }	
  
  public Result getResult(int position) {
		return this.proposalController.getResult(position);
	}

	public boolean isLooser() {
		return this.proposalController.isLooser();
	}
	
	public boolean isWinner() {
		return this.proposalController.isWinner();
	}
}
