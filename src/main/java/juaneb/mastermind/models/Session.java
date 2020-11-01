package main.java.juaneb.mastermind.models;

import main.java.juaneb.mastermind.types.StateValue;

public interface Session {

  StateValue getValueState();

  int getWidth();	

  Game getGame();	

  State getState();	

  void register();	

}
