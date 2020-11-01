package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.types.Color;
import main.java.juaneb.utils.Console;

class ColorView extends main.java.juaneb.mastermind.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
