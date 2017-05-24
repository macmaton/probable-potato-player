package abc.music;

/**
 * Immutable data type to represent a tuplet in abc notation.
 *
 */
public class Tuplet implements Music {
	//TODO: reconsider representation of tuplet
	private final int spec;
	private final Note[] notes;
	
	public Tuplet(int spec, Note[] notes) {
		this.spec = spec;
		this.notes = notes;
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
		String result = String.valueOf(spec) + ")";
		for(Note n : notes) {
			result += n.toString();
		}
		result += " ";
		return result;
	}

	
	
}
