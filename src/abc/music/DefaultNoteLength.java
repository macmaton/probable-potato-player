package abc.music;

/**
 * Immutable representation of the default note length for a piece, the length of a note without a specified note length
 */
public class DefaultNoteLength implements Music {
	private final NoteLengthTest defaultNoteLength;
	
	public DefaultNoteLength(NoteLengthTest defaultNoteLength) {
		this.defaultNoteLength = defaultNoteLength;
	}
	
	public NoteLengthTest getDefaultNoteLength() {
		return defaultNoteLength;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof DefaultNoteLength) {
			DefaultNoteLength that = (DefaultNoteLength) obj;
			return this.toString().equals(that.toString());
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
