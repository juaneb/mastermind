package main.java.juaneb.mastermind.models;

public class Result {

	public static final int WIDTH = 4;
	private int blacks = 0;
	private int whites = 0;

	Result(int blacks, int whites) {
		assert blacks >= 0;
		assert whites >= 0;

		this.blacks = blacks;
		this.whites = whites;
	}

	boolean isWinner() {
		return this.blacks == Result.WIDTH;
	}

	void writeln() {
		Message.RESULT.writeln(this.blacks, this.whites);
	}

	public int getBlacks() {
		return this.blacks;
	}

	public int getWhites() {
		return this.whites;
	}
	
}
