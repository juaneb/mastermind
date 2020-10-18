package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;

public class View extends main.java.juaneb.mastermind.views.View{
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(StartController startController, ProposalController proposalController, ResumeController resumeController) {	
		this.startView = new StartView(startController);
		this.proposalView = new ProposalView(proposalController);
		this.resumeView = new ResumeView(resumeController);
	}

	@Override
	protected void start(){
		this.startView.interact();
	}

	@Override
	protected boolean play(){
		return this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame(){
		return this.resumeView.interact();
	}
}
