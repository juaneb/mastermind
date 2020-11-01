package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.controllers.ProposalController;

import main.java.juaneb.mastermind.models.Session;

import main.java.juaneb.mastermind.distributed.dispatchers.FrameType;
import main.java.juaneb.mastermind.distributed.dispatchers.TCPIP;

import main.java.juaneb.mastermind.types.Color;
import main.java.juaneb.mastermind.types.Error;

import java.util.List;

public class ProposalControllerProxy extends ProposalController {

	private TCPIP tcpip;

	ProposalControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void undo() {
		this.tcpip.send(FrameType.UNDO.name());
	}

	@Override
	public void redo() {
		this.tcpip.send(FrameType.REDO.name());
	}

	@Override
	public boolean undoable() {
		this.tcpip.send(FrameType.UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean redoable() {
		this.tcpip.send(FrameType.REDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean isWinner() {
		this.tcpip.send(FrameType.ISWINNER.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean isLooser() {
		this.tcpip.send(FrameType.ISLOOSER.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public int getAttempts() {		
		this.tcpip.send(FrameType.GETATTEMPTS.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public List<Color> getColors(int position) {		
		this.tcpip.send(FrameType.GETCOLORS.name());	
		//modificarrrrrrrr
		return this.session.getGame().getColors(position);	
		//return this.tcpip.receiveGetColors();
	}

	@Override
	public int getBlacks(int position) {		
		this.tcpip.send(FrameType.GETBLACKS.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public int getWhites(int position) {		
		this.tcpip.send(FrameType.GETWHITES.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public void register() {
		this.session.register();
	}

	@Override		
	public Error addProposedCombination(List<Color> colors) {
		this.tcpip.send(FrameType.PROPOSECOMBINATION.name());		
		//'Aquí debo de recoger el string del proposal'
		this.tcpip.send("rgby");
		return this.tcpip.receiveError();
	}

	@Override
	public void continueState() {
		this.tcpip.send(FrameType.CONTINUE_STATE.name());
	}
			
}
