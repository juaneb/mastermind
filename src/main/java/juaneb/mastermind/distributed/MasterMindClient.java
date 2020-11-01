package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.Mastermind;
import main.java.juaneb.mastermind.controllers.Logic;

public class MasterMindClient extends Mastermind{

	private LogicProxy logicProxy;
	
	@Override
	protected Logic createLogic() {
		this.logicProxy = new LogicProxy();
		return this.logicProxy;
	}

	@Override
	protected void play() {
		super.play();
		this.logicProxy.close();
	}
	
	public static void main(String[] args) {
		new MasterMindClient().play();
	}

}
