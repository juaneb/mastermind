package main.java.juaneb.mastermind;
import main.java.juaneb.utils.Console;


//import usantatecla.utils.Direction;

class Board {

    private static final int NUMBER_ROWS = 4;
    private static final int NUMBER_COLUMNS = 10;    

    //dos arrays de combinaciones, las del MakerPlayer y las del BreakerPlayer
    private Combination combinationMaker;
    private Combination combinationBreaker[];
    private final int numAttempts = 0;



	Board() {
        
        //preparo el array con las combinaciones del MakerPlayer vacías
		/*for (int i = 0; i < NUMBER_COLUMNS; i++) {
			this.combinationBreaker[i] = Combination.NULL_COMBINATION;
        }*/
        
        //preparo la combinación secreta del MakerPlayer
        this.combinationMaker = new SecretCombination();

    }


	void write() {
        Console.instance().write(this.numAttempts + " ") ;
        Message.NUM_ATTEMPTS.writeln();

		/*for (int i = 0; i<Coordinate.DIMENSION; i++) {
			Message.VERTICAL_LINE_LEFT.write();
			for (int j = 0; j<Coordinate.DIMENSION; j++) {
				this.getToken(new Coordinate(i, j)).write();
				Message.VERTICAL_LINE_CENTERED.write();
			}
			Message.VERTICAL_LINE_RIGHT.writeln();
		}*/
		/*Message.SEPARATOR.writeln();*/
	}

	boolean isSuperedNumAttemptes() {
        return this.numAttempts < this.NUMBER_COLUMNS;
    }

    boolean isCombinationGuess() {
        return this.numAttempts < this.NUMBER_COLUMNS;
    }

}
