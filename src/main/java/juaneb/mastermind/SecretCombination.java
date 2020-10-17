package main.java.juaneb.mastermind;

import java.util.Random;
import java.util.Collections;
import main.java.juaneb.utils.Console;

class SecretCombination extends Combination {

	SecretCombination() {
        super();   
        for(int i=0; i<Color.length(); i++) {
			this.colors.add(Color.get(i));
		}
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < Color.length() - this.SIZE_COMBINATION; i++) {
			this.colors.remove(random.nextInt(this.colors.size()));
		}
		Collections.shuffle(this.colors);
	}       
	
	void writeln() {
		Console.instance().write("**** - ");
		for (Color color : this.colors) {
			color.write();
		}
		Console.instance().writeln();
	}
    
}
