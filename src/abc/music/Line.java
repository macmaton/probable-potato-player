package abc.music;

public class Line implements Music {
	//TODO: representation of Line

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Line) {
			Line that = (Line) obj;
			return this.toString().equals(that.toString());
		} else {
			return false;
		}
	}
}
