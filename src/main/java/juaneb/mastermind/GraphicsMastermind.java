package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind{

	@Override
	protected View createView(Logic logic){		
		return new View(logic);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	

}
