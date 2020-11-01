package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.controllers.Logic;
import main.java.juaneb.mastermind.types.StateValue;
import main.java.juaneb.mastermind.distributed.dispatchers.TCPIP;

public class LogicProxy extends Logic {
	
	private TCPIP tcpip;
	
	public LogicProxy() {
		this.tcpip = TCPIP.createClientSocket();
		this.session = new SessionProxy(this.tcpip);
		this.controllers.put(StateValue.INITIAL, new StartControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValue.IN_GAME, new ProposalControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValue.FINAL, new ResumeControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValue.EXIT, null);
	}

	public void close() {
		this.tcpip.close();
	}
	
}
