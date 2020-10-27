package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ProposalController;

abstract class Command extends main.java.juaneb.utils.Command {

  protected ProposalController proposalController;

  protected Command(String title, ProposalController proposalController) {
    super(title);
    this.proposalController = proposalController;
  }

}
