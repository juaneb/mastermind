package main.java.juaneb.mastermind.views;

import main.java.juaneb.utils.YesNoDialog;

public class ResumeView {

	public boolean read() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}
	
}
