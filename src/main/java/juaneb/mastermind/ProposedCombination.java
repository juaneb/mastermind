package main.java.juaneb.mastermind;



public class ProposedCombination extends Combination {

    ProposedCombination() {
        super();   
    }


    void write() {
		for (Color color : this.colors) {
			color.write();
		}
	}
    
}
