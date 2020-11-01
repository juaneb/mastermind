package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.AcceptorController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.controllers.ControllersVisitor;

public class View  implements ControllersVisitor{
	
	private StartView startView;	
	private ProposalView proposalView;	
	private ResumeView resumeView;
	
	public View(){
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
	}
	
	public void interact(AcceptorController controller) {
		controller.accept(this);
	}

	
	public void visit(StartController startController) {
		this.startView.interact(startController);		
	}

	
	public void visit(ProposalController proposalController) {
		this.proposalView.interact(proposalController);
	}

	
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

}
