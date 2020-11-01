package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.distributed.dispatchers.FrameType;
import main.java.juaneb.mastermind.models.Game;
import main.java.juaneb.mastermind.models.Session;
import main.java.juaneb.mastermind.models.State;
import main.java.juaneb.mastermind.types.StateValue;
import main.java.juaneb.utils.TCPIP;

public class SessionProxy implements Session {

	private TCPIP tcpip;

	public SessionProxy(TCPIP tcpip) {
		this.tcpip = tcpip;
	}

	public StateValue getValueState() {
		this.tcpip.send(FrameType.STATE.name());
		return StateValue.values()[this.tcpip.receiveInt()];
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub

	}
	

}
