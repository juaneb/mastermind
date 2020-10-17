package main.java.juaneb.mastermind.views;

import main.java.juaneb.mastermind.models.*;
import main.java.juaneb.utils.WithConsoleView;

public class ResultView extends WithConsoleView {

    private Result result;

    ResultView(Result result) {
		this.result = result;
	}

    void writeln() {
        MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }
}