package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.views.console.View;

class ConsoleMastermind extends Mastermind{

	@Override
	protected View createView(Logic logic){		
		return new View(logic);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	

}
