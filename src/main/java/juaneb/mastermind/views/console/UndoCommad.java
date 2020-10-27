package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.views.MessageView;

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
