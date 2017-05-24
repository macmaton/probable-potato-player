package abc.music;

public class Composer implements Music {
	private final String composer;
	
	public Composer(String name) {
		composer = name;
	}
	
	public String getComposer() {
		return this.composer;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Composer) {
			Composer that = (Composer) obj;
			return this.toString().equals(that.toString());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return composer.hashCode();
	}

	@Override
	public String toString() {
		return "V: " + composer;
	}
}
