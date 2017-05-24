package abc.music;

public class Voice implements Music {
	private final String voice;
	
	public Voice(String name) {
		voice = name;
	}
	
	public String getVoice() {
		return voice;
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
		return voice.hashCode();
	}

	@Override
	public String toString() {
		return "V: " + voice;
	}

}
