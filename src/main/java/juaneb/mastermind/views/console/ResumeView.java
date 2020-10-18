package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.utils.YesNoDialog;
import main.java.juaneb.utils.WithConsoleView;

class ResumeView extends WithConsoleView{

	private ResumeController resumeController;

	public ResumeView(ResumeController resumeController){
		this.resumeController = resumeController;
	}	

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.resumeController.resume();
		}
		return newGame;
	}

}
