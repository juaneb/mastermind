package main.java.juaneb.mastermind.views.graphics	;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.utils.YesNoDialog;

class ResumeView {

	private Game game;
	/*JEB aquí metería todos los atributos propios de la interfaz gráfica*/

	ResumeView(Game game) {
		this.game = game;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

	/*JEB aquí metería todos los métodos propios de la interfaz gráfica*/

}
