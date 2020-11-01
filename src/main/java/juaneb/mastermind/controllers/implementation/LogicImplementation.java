package main.java.juaneb.mastermind.controllers.implementation;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.models.SessionImplementation;
import main.java.juaneb.mastermind.types.StateValue;

public class LogicImplementation extends Logic {

	protected StartControllerImplementation startControllerImplementation;

	protected ProposalControllerImplementation proposalControllerImplementation;

	protected ResumeControllerImplementation resumeControllerImplementation;

	public LogicImplementation() {
		this.session = new SessionImplementation();
		this.startControllerImplementation = new StartControllerImplementation(this.session);
		this.proposalControllerImplementation = new ProposalControllerImplementation(this.session);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
		this.controllers.put(StateValue.INITIAL, this.startControllerImplementation);
		this.controllers.put(StateValue.IN_GAME, this.proposalControllerImplementation);
		this.controllers.put(StateValue.FINAL, this.resumeControllerImplementation);
		this.controllers.put(StateValue.EXIT, null);
	}

}
