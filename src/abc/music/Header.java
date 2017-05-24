package abc.music;

/**
 * An immutable data type representing the header of a piece in abc notation
 * 1 - X: index number; 2 - T: title; * - C: composer; * - M: meter; * - L: length -
 * default duration of a note; last - K: key
 */
public class Header {
	//TODO: implementation of header
	Index index;
	Title title;
	Key key;
	Composer composer;
	DefaultNoteLength length;
	Meter meter;
	Tempo tempo;
	Voice[] voices;
	
	public Header(Index index, Title title, Key key) {
		this.index = index;
		this.title = title;
		this.key = key;
		
		//TODO: default values when not provided
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Header) {
			Header that = (Header) obj;
			return this.toString().equals(that.toString());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
