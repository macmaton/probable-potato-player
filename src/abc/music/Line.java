package abc.music;

public class Line implements BodyElement {
    //TODO: representation of Line
    private final Measure[] measures;
    private final Voice voice;

    public Line(Voice voice, Measure[] measures) {
        this.voice = voice;
        this.measures = measures;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(voice.toString() + "\n");
        for (int i = 0; i < measures.length; i++) {
            result.append(measures[i].toString());
            if (i < measures.length-1) {
                result.append("|");
            }
        }
        return result.toString();
    }
}
