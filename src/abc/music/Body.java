package abc.music;

/**
 * An immutable data type representing the body of a piece of music in abc notation
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public class Body implements Music {
	//TODO: representation of Body
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NoteLength) {
			return this.toString().equals(obj.toString());
		} else {
			return false;
		}
	}
}