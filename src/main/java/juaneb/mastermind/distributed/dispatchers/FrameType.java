package main.java.juaneb.mastermind.distributed.dispatchers;

public enum FrameType { 
	START,	
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE,
	ISWINNER,
	ISLOOSER,
	GETATTEMPTS,
	GETCOLORS,
	GETBLACKS,
	GETWHITES,
	REGISTER,	
	PROPOSECOMBINATION,
	CLOSE,	
	CONTINUE_STATE,
	NEW_GAME;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
