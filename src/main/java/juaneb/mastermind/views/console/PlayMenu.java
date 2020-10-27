package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.utils.Menu;

public class PlayMenu extends Menu {

  PlayMenu(ProposalController proposalController) {
    this.addCommand(new PlayCommand(proposalController));
    this.addCommand(new UndoCommand(proposalController));
    this.addCommand(new RedoCommand(proposalController));
  }

}
