package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.controllers.UseCaseController;
import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.views.View;


public abstract class Mastermind {

    private Logic logic;
    private View view;

    protected Mastermind() {        
        this.logic = new Logic();
        this.view = this.createView(this.logic);
    }

    protected abstract View createView(Logic logic);

    protected void play() {
        UseCaseController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
		} while (controller != null);
    }
    
}
