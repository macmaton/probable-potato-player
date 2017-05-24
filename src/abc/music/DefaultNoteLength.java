package abc.music;

/**
 * Immutable representation of the default note length for a piece, the length of a note without a specified note length
 */
public class DefaultNoteLength implements Music {
	private final NoteLength defaultNoteLength;
	
	public DefaultNoteLength(NoteLength defaultNoteLength) {
		this.defaultNoteLength = defaultNoteLength;
	}
	
	public NoteLength getDefaultNoteLength() {
		return defaultNoteLength;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NoteLength) {
			return this.toString().equals(obj.toString());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "L: " + defaultNoteLength.toString();
	}
}
