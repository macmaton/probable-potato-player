package abc.music;

public class Line implements Music {
	//TODO: representation of Line

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NoteLength) {
			return this.toString().equals(obj.toString());
		} else {
			return false;
		}
	}
}
