package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.models.*;
import main.java.juaneb.mastermind.views.View;

public class Mastermind {

	private Board board;
	private View view;

	Mastermind() {
		this.board = new Board();
		this.view = new View (this.board);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
