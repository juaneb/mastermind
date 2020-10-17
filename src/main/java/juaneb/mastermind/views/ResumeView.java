package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.models.*;
import main.java.juaneb.utils.WithConsoleView;
import main.java.juaneb.utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

    private Board board;

	ResumeView(Board board) {
		this.board = board;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.board = new Board();
		}
		return newGame;
	}
}