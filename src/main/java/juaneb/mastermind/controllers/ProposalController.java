package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.ProposedCombination;
import main.java.juaneb.mastermind.models.SecretCombination;
import main.java.juaneb.mastermind.models.Result;
import main.java.juaneb.mastermind.models.State;

import java.util.List;

public class ProposalController extends UseCaseController {

	private SecretCombination secretCombination;
	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;

	public ProposalController(Game game, State state) {
		super(game, state);
	  }

	  

	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombinations.add(proposedCombination);
		this.results.add(this.secretCombination.getResult(proposedCombination));
		this.attempts++;
		this.state.next();
	}

	public int getAttempts() {
		return this.attempts;
	}

	public ProposedCombination getProposedCombination(int position) {
		return this.proposedCombinations.get(position);
	}	

	public Result getResult(int position) {
		return this.results.get(position);
	}

	public boolean isLooser() {
		return this.attempts == game.getWidth();
	}
	
	public boolean isWinner() {
		return this.results.get(this.attempts-1).isWinner();
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
	  controllerVisitor.visit(this);
	}


}
