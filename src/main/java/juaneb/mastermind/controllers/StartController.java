package main.java.juaneb.mastermind.controllers;

import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.State;

public class StartController extends UseCaseController {

  public StartController(Game game, State state) {
    super(game, state);
  }

  public void nextState() {    
    this.state.next();
  }

  @Override
  public void accept(ControllerVisitor controllerVisitor) {
    controllerVisitor.visit(this);
  }


}
