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
		if (obj == null) {return false;}
		if(obj instanceof Voice) {
			Voice that = (Voice) obj;
			return this.toString().equals(that.toString());
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
