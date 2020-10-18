package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.ProposedCombination;
import main.java.juaneb.mastermind.models.Result;

import main.java.juaneb.mastermind.models.State;
import main.java.juaneb.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

  private Game game;
  private StartController startController;
  private ProposalController proposalController;
  private ResumeController resumeController;
  private State state;
  private Map<StateValue, Controller> controllers;

  public Logic() {
    this.game = new Game();
    this.startController = new StartController(this.game, this.state);
    this.proposalController = new ProposalController(this.game, this.state);
    this.resumeController = new ResumeController(this.game, this.state);
    this.state = new State();
    this.controllers = new HashMap<StateValue, Controller>();
    this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
    this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
    this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
    this.controllers.put(StateValue.EXIT, null);
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
  
  public Controller getController() {
    return this.controllers.get(this.state.getValueState());
  }
}
