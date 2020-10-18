package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;

public class ResumeController extends Controller {

  public ResumeController(Game game) {
    super(game);
  }

  public void resume() {
    this.game.clear();
  }
}

