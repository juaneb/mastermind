package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.controllers.Logic;

public class View extends main.java.juaneb.mastermind.views.View{
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(Logic logic) {	
		this.startView = new StartView(logic);
		this.proposalView = new ProposalView(logic);
		this.resumeView = new ResumeView(logic);
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
