package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.views.View;
import main.java.juaneb.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	protected View createView() {
		return new ConsoleView();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
