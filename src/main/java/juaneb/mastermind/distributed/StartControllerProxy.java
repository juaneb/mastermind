package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.controllers.StartController;
import main.java.juaneb.mastermind.distributed.dispatchers.FrameType;
import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.utils.TCPIP;

public class StartControllerProxy extends StartController {
	
	private TCPIP tcpip;

	public StartControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void start() {
		this.tcpip.send(FrameType.START.name());
	}

}
