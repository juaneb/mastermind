package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.ProposalController;

class UndoCommand extends Command {

  UndoCommand(ProposalController proposalController) {
    super(MessageView.UNDO_COMMAND.getMessage(), proposalController);
  }

  protected void execute() {
    this.proposalController.undo();
  }

  protected boolean isActive() {
    return this.proposalController.undoable();
  }

}
