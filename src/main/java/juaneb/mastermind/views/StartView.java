package main.java.juaneb.mastermind.views;

import main.java.juaneb.utils.WithConsoleView;

public class StartView extends WithConsoleView {	
	
	public void write() {
		this.console.writeln(MessageView.TITLE.getMessage());
	}

}
