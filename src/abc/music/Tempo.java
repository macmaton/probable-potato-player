package abc.music;

public class Tempo implements Music {
	int beatsPerMinute;
	NoteLength beatLength;
	
	public Tempo(DefaultNoteLength beatLength) {
		beatsPerMinute = 100;
		this.beatLength = beatLength.getDefaultNoteLength();
	}
	
	public Tempo(int beatsPerMinute, NoteLength beatLength) {
		this.beatsPerMinute = beatsPerMinute;
		this.beatLength = beatLength;
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
		return "Q: " + beatLength.toString() + "=" + String.valueOf(beatsPerMinute);
	}

}
