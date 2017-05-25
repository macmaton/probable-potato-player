package abc.music;

public class Tempo implements Music {
	int beatsPerMinute;
	NoteLengthTest beatLength;
	
	public Tempo(DefaultNoteLength beatLength) {
		beatsPerMinute = 100;
		this.beatLength = beatLength.getDefaultNoteLength();
	}
	
	public Tempo(int beatsPerMinute, NoteLengthTest beatLength) {
		this.beatsPerMinute = beatsPerMinute;
		this.beatLength = beatLength;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Tempo) {
			Tempo that = (Tempo) obj;
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
		return "Q: " + beatLength.toString() + "=" + String.valueOf(beatsPerMinute);
	}

}
