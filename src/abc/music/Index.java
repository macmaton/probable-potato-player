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
		if (obj == null) {return false;}
		if(obj instanceof Index) {
			Index that = (Index) obj;
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
		return "X: " + String.valueOf(index);
	}

}
