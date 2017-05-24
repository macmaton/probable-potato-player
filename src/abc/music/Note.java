package abc.music;

public class Note implements Music {
	Music noteorrest;
	NoteLength length;
	
	public Note(Pitch noteorrest, NoteLength length) {
		this.noteorrest = noteorrest;
		this.length = length;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Note) {
			Note that = (Note) obj;
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
		return noteorrest.toString() + length.toString();
	}
	
	

}
