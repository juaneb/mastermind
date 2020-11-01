package main.java.juaneb.mastermind.models;

import main.java.juaneb.mastermind.types.StateValue;

public class SessionImplementation implements Session {

	private Game game;
	private GameRegistry registry;
	private State state;
  
	public SessionImplementation() {
	  this.state = new State();
	  this.game = new Game();
	  this.registry = new GameRegistry(this.game);
	}
  
	public Game getGame(){
	  return this.game;
	}
  
	public State getState(){
	  return this.state;
	}
  
	public StateValue getValueState() {
	  return this.state.getValueState();
	}
	
	public void undo() {
	  this.registry.undo();    
	}
  
	public boolean undoable() {
	  return this.registry.isUndoable();
	}
  
	public void redo() {
	  this.registry.redo();
	}
  
	public boolean redoable() {
	  return this.registry.isRedoable();
	}
  
	public void register() {
	  this.registry.register();
	}

	public void next() {
		this.state.next();		
	}
	
	public int getWidth() {
		return this.getGame().getWidth();		
	}	
}
