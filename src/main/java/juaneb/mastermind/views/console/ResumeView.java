package main.java.juaneb.mastermind.views.console;

import main.java.juaneb.mastermind.controllers.ResumeController;
import main.java.juaneb.mastermind.views.MessageView;
import main.java.juaneb.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
