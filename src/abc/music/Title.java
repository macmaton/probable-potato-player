package abc.music;

public class Title implements Music {
	private final String title;
	
	public Title(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Title) {
			Title that = (Title) obj;
			return this.toString().equals(that.toString());
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	@Override
	public String toString() {
		return title;
	}
	
	

}
