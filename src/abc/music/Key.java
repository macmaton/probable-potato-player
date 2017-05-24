package abc.music;

public class Key implements Music {
	private final BaseNote key;
	private final int modifier;
	private final boolean minor;
	
	public Key(BaseNote key, int modifier, boolean minor) {
		this.key = key;
		this.modifier = modifier;
		this.minor = minor;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Key) {
			Key that = (Key) obj;
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
		String basenote = key.toString();
		String modifier = "";
		String minor = "";
		if(this.modifier != 0) {
			if(this.modifier > 0) {
				modifier = "#";
			} else if (this.modifier < 0) {
				modifier = "b";
			}
		}
		if(this.minor) {
			minor = "m";
		}
		
		return basenote + modifier + minor;
	}

}
