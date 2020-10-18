package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.controllers.Controller;
import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;

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
	public void interact(Controller controller) {
		if (controller instanceof StartController) {
			this.startView.interact((StartController) controller);
		} else {
			if (controller instanceof ProposalController) {
				this.proposalView.interact((ProposalController) controller);
			} else {
				this.resumeView.interact((ResumeController) controller);
			}
		}
	}
}
