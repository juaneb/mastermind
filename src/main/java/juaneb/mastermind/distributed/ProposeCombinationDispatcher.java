package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.controllers.ProposalController;
import main.java.juaneb.mastermind.distributed.dispatchers.Dispatcher;
import main.java.juaneb.mastermind.types.Color;
import main.java.juaneb.mastermind.views.ColorView;

import java.util.ArrayList;
import java.util.List;

public class ProposeCombinationDispatcher extends Dispatcher {

	public ProposeCombinationDispatcher(ProposalController proposalController) {
		super(proposalController);
	}

	@Override
	public void dispatch() {

		String characters = this.tcpip.receiveLine();
		List<Color> colors = new ArrayList<Color>();
		for (int i = 0; i < characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));

			((ProposalController) this.acceptorController).addProposedCombination(colors);
		}
	}
}