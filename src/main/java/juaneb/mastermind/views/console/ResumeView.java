package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.utils.YesNoDialog;
import main.java.juaneb.utils.WithConsoleView;

class ResumeView extends WithConsoleView{

	private Logic logic;

	public ResumeView(Logic logic){
		this.logic = logic;
	}	

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.logic.resume();
		}
		return newGame;
	}

}
