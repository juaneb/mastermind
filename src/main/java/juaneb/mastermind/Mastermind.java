package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.views.View;
import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.controllers.ResumeController;


public abstract class Mastermind {

    private Game game;    
    private StartController startController;
    private ProposalController proposalController;
    private ResumeController resumeController;
    private View view;

    protected Mastermind() {
        this.game = new Game();        
        this.startController = new StartController(this.game);
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(this.startController, this.proposalController,this.resumeController);
    }

    protected abstract View createView(StartController startController, ProposalController proposalController, ResumeController resumeController);

    protected void play() {
        this.view.interact();
    }
    
}
