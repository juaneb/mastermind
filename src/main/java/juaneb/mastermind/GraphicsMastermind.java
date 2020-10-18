package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.views.graphics.View;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.mastermind.controllers.StartController; 

public class GraphicsMastermind extends Mastermind{

	@Override
	protected View createView(StartController startController, ProposalController proposalController, ResumeController resumeController){		
		return new View(startController,proposalController, resumeController);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	

}
