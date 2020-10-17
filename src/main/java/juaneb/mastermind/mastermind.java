package main.java.juaneb.mastermind;

import main.java.juaneb.utils.YesNoDialog;

class MasterMind {

    private Board board;
    private BreakerPlayer humanPlayer;
    private MakerPlayer machinePlayer;

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        this.board = new Board();
        this.humanPlayer = new BreakerPlayer(this.board);
        this.machinePlayer = new MakerPlayer(this.board);
        
        Message.TITLE.writeln();
        this.machinePlayer.secretCombination();   

        do {
            this.board.write();            
            this.humanPlayer.proposedCombination();            
            this.machinePlayer.giveResults();         
        } while (!board.isSuperedNumAttemptes() & (!board.isCombinationGuess()));        
    }

    private boolean isResumedGame() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
