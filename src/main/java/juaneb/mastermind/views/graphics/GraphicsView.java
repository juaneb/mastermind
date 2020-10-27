package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.controllers.AcceptorController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.views.View;

public class GraphicsView extends View {

	private GameView gameView;

	public GraphicsView() {
		this.gameView = new GameView();
	}

	@Override
	public void interact(AcceptorController controller) {
		//controller.accept(this);
	}
	
	public void visit(StartController startController) {
		this.gameView.interact(startController);
	}

	
	public void visit(ProposalController proposalController) {
		this.gameView.interact(proposalController);
	}

	
	public void visit(ResumeController resumeController) {
		ResumeDialog resumeDialog = new ResumeDialog();
		resumeController.resume(resumeDialog.isNewGame());
		if (resumeDialog.isNewGame()) {
			this.gameView = new GameView();
		} else {
			this.gameView.setVisible(false);
			System.exit(0);
		}
	}

}
