package abc.music;

/**
 * Immutable representation of the default note length for a piece
 */
public class DefaultNoteLength implements Music {
	private final NoteLength defaultNoteLength;
	private final boolean isSpecified;
	
	public DefaultNoteLength(NoteLength defaultNoteLength, boolean isSpecified) {
		this.defaultNoteLength = defaultNoteLength;
		this.isSpecified = isSpecified;
	}
	
	public NoteLength getDefaultNoteLength() {
		return defaultNoteLength;
	}
	
	public boolean isSpecified() {
		return isSpecified;
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
		if (isSpecified) {
			return "L: " + defaultNoteLength.toString();
		} else {
			return "";
		}
	}
}
