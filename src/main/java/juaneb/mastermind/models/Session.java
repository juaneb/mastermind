package main.java.juaneb.mastermind.models;

public class Session {

  private Game game;
  private GameRegistry registry;
  private State state;

  public Session() {
    this.state = new State();
    this.game = new Game();
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
    this.registry = new GameRegistry(this.game);
  }

}
