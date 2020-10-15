package main.java.juaneb.mastermind;

import main.java.juaneb.utils.Console;

enum Message {
	TITTLE("----- MASTERMIND -----"),	
	NUM_ATTEMPTS("attempt(s):"),
	PROPOSE_COMBINATION("Propose a combination"),
	
	/*NUMBER_PLAYERS("Number of user"), 
	SEPARATOR("-------------"), 
	VERTICAL_LINE_LEFT("| "), 
	VERTICAL_LINE_CENTERED(" | "),
	VERTICAL_LINE_RIGHT(""), 
	ENTER_COORDINATE_TO_PUT("Enter a coordinate to put a token:"),
	ENTER_COORDINATE_TO_REMOVE("Enter a coordinate to remove a token:"), 
	COORDINATE_TO_PUT("Coordinate to put"),
	COORDINATE_TO_REMOVE("Origin coordinate to move"), 
	COORDINATE_TO_MOVE("Target coordinate to move"),
	PLAYER_WIN(" Player: You win!!! :-)"), */
	RESUME("Do you want to continue"),
	NULL_MESSAGE();

	private String message;

	private Message() {
		
	}
	
	private Message(String message) {
		this.message = message;
	}

	void write() {
		Console.instance().write(this.message);
	}

	void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
	}

}