package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.models.Game;

public class View extends main.java.juaneb.mastermind.views.View{
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(Game game) {
		super(game);
		this.startView = new StartView();
		this.proposalView = new ProposalView(this.game);
		this.resumeView = new ResumeView(this.game);
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
