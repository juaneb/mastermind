package main.java.juaneb.mastermind;

public class Result {

    private static final int WIDTH = 4;
	private int blacks = 0;
	private int whites = 0;

	Result(int blacks, int whites) {
		this.blacks = blacks;
		this.whites = whites;
	}

	void writeln() {
		Message.RESULT.writeln(this.blacks, this.whites);
	}

	boolean isWinner(){
		return this.blacks == Result.WIDTH;
	};

}
