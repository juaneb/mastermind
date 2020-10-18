package main.java.juaneb.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private final int MAX_LONG = 10;
	private SecretCombination secretCombination;
	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;

	public Game() {
		this.clear();
	}

	public void clear() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
		this.attempts = 0;
	}

	public  int getWidth(){
		return this.MAX_LONG;
	}

}
