package main.java.juaneb.mastermind;

class MakerPlayer extends Player{

    MakerPlayer(Board board) {				
      super(board);      
    }
    
    void secretCombination(){
      this.board.secretCombination =  new SecretCombination();
    }        

    Result giveResults(){
      return new Result(0, 0);
    }        

}
