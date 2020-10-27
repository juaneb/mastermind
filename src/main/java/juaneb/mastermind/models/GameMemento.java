package main.java.juaneb.mastermind.models;

class GameMemento { 
  
	private ProposedCombination proposedCombinations;
	

  GameMemento(ProposedCombination proposedCombinations) {    
    this.proposedCombinations = proposedCombinations.copy();   
  }

  ProposedCombination getproposedCombinations() {
    return this.proposedCombinations;
  }


}
