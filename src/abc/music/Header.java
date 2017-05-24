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
		if(obj instanceof NoteLength) {
			return this.toString().equals(obj.toString());
		} else {
			return false;
		}
	}

}
