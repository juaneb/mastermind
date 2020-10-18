package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.utils.YesNoDialog;
import main.java.juaneb.utils.WithConsoleView;

class ResumeView extends WithConsoleView{

	private Game game;

	ResumeView (Game game){
		this.game = game;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}
