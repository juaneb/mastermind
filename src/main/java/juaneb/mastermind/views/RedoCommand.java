package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.views.MessageView;

class RedoCommand extends Command {

  RedoCommand(ProposalController proposalController) {
    super(MessageView.REDO_COMMAND.getMessage(), proposalController);
  }

  @Override
  protected void execute() {
    this.proposalController.redo();
  }

  @Override
  protected boolean isActive() {
    return this.proposalController.redoable();
  }

}
