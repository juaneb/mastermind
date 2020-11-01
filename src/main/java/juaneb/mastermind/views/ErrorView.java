package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.utils.Console;

public class ErrorView {

	public static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	protected Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	public String getMessage() {
		return ErrorView.MESSAGES[this.error.ordinal()];
	}

	void writeln() {
		Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);		
	}

	
	
}
