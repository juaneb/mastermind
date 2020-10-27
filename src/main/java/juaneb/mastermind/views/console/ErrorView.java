package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.types.Error;
import main.java.juaneb.utils.Console;

class ErrorView extends main.java.juaneb.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}
