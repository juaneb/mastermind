package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind{

	@Override
	protected View createView(Game game) {
		return new View(game);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	

}
