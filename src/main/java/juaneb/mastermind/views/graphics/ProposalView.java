package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.ProposedCombination;

class ProposalView {

	private Game game;	
	private SecretCombinationView secretCombinationView;
	/*JEB aquí metería todos los atributos propios de la interfaz gráfica. No heredo de WithConsoleView porque no voy a usar una interfaz de consola*/

	ProposalView(Game game) {
		this.game = game;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.game.addProposedCombination(proposedCombination);
		//this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.game.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.game.getAttempts(); i++) {
			new ProposedCombinationView(this.game.getProposedCombination(i)).write();
			new ResultView(this.game.getResult(i)).writeln();
		}
		if (this.game.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.game.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

	/*JEB aquí metería todos los métodos propios de la interfaz gráfica*/

}
