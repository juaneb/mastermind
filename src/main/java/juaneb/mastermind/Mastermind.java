package main.java.juaneb.mastermind;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.views.View;

public abstract class Mastermind {

    private Game game;

    private View view;

    protected Mastermind() {
        this.game = new Game();
        this.view = this.createView(this.game);
    }

    protected abstract View createView(Game game);

    protected void play() {
        this.view.interact();
    }
    
}
