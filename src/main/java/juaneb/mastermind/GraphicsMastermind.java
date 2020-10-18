package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind{

	@Override
	protected View createView(Game game) {
		return new View(game);
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}	

}
