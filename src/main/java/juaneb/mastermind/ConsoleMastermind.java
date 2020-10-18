package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.views.console.View;

public class ConsoleMastermind {

	private Game game;
	
	private View view;

	private ConsoleMastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	

}
