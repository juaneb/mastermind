package main.java.juaneb.mastermind.models;

import java.util.List;

import main.java.juaneb.mastermind.types.Color;

class ProposedCombination extends Combination {

	ProposedCombination(List<Color> colors) {
		this.colors = colors;
	}

	private ProposedCombination(ProposedCombination proposedCombination) {
		super();
	}

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	ProposedCombination copy() {
		return new ProposedCombination(this);
	}

}
