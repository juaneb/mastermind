package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.controllers.implementation.LogicImplementation;

public class MasterMindStandalone extends Mastermind {

    @Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}
	
	public static void main(String[] args) {
		new MasterMindStandalone().play();
	}
    
}