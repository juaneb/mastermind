package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.views.View;
import main.java.juaneb.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind{

	protected View createView() {
		return new GraphicsView();
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}
