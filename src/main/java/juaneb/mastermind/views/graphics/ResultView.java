package main.java.juaneb.mastermind.views.graphics;

import main.java.juaneb.mastermind.models.Result;
import main.java.juaneb.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
