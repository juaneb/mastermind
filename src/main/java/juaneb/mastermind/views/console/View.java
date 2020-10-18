package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.mastermind.controllers.UseCaseController;
import main.java.juaneb.mastermind.controllers.ControllerVisitor;

public class View extends main.java.juaneb.mastermind.views.View implements ControllerVisitor{	
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(Logic logic) {	
		this.startView = new StartView(logic);
		this.proposalView = new ProposalView(logic);
		this.resumeView = new ResumeView(logic);
	}

	@Override
	public void interact(UseCaseController controller) {
		controller.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(ProposalController proposalController) {
		this.proposalView.interact(proposalController);	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
}
