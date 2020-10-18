package main.java.juaneb.mastermind.views.graphics	;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.controllers.ResumeController;

import main.java.juaneb.utils.YesNoDialog;
import main.java.juaneb.utils.WithConsoleView;

class ResumeView extends WithConsoleView{

	private Logic logic;

	public ResumeView(Logic logic){
		this.logic = logic;
	}	

	boolean interact(ResumeController resumeController) {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.logic.resume();
		}
		return newGame;
	}

}
