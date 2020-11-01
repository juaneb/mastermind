package main.java.juaneb.mastermind.distributed;

import main.java.juaneb.mastermind.controllers.implementation.LogicImplementation;
import main.java.juaneb.mastermind.distributed.dispatchers.IsLooserDistpacher;
import main.java.juaneb.mastermind.distributed.dispatchers.ContinueStateDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.GetAttemptsDistpacher;
import main.java.juaneb.mastermind.distributed.dispatchers.DispatcherPrototype;
import main.java.juaneb.mastermind.distributed.dispatchers.FrameType;
import main.java.juaneb.mastermind.distributed.dispatchers.IsWinnerDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.ResumeDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.StartDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.StateDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.undoredo.UndoDispatcher;
import main.java.juaneb.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;

public class LogicImplementationServer extends LogicImplementation {

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));		
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.ISWINNER, new IsWinnerDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.ISLOOSER, new IsLooserDistpacher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.GETATTEMPTS, new GetAttemptsDistpacher(this.proposalControllerImplementation));
		/*dispatcherPrototype.add(FrameType.GETCOLORS, new GetColorsDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.GETBLACKS, new GetBlacksDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.GETWHITES, new GetWhitesDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.REGISTER, new RegisterDistpacher(this.proposalControllerImplementation));*/
		dispatcherPrototype.add(FrameType.PROPOSECOMBINATION, new ProposeCombinationDispatcher(this.proposalControllerImplementation));		
		dispatcherPrototype.add(FrameType.CONTINUE_STATE, new ContinueStateDispatcher(this.proposalControllerImplementation));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
	}

}
