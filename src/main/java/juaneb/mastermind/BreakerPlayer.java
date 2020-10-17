package main.java.juaneb.mastermind;

public class BreakerPlayer extends Player{

    private ProposedCombination[]  proposedCombination;    

    BreakerPlayer(Board board) {		
		super(board);
  }
  
  ProposedCombination proposedCombination(){
    return new ProposedCombination();
  }  
}
