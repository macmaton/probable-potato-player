package abc.music;

/**
 * represents the index number of a piece in abc notation
 * denoted by X: in the first line of the file
 */
public class Index implements Music {
	private final int index;
	
	public Index(int index) {
		this.index = index;
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
		return "X: " + String.valueOf(index);
	}

}
