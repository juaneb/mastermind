package main.java.juaneb.mastermind.views;

import main.java.juaneb.utils.WithConsoleView;

public class StartView extends WithConsoleView{
   
	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}
    
    
}
