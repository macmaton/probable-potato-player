package abc.music;

/**
 * Created by margaret on 5/31/17.
 */
public class Measure {

    private final MeasureElement[] elements;

    public Measure(MeasureElement[] elements) {
        this.elements = elements;
    }

    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        for (MeasureElement e : elements) {
            result.append(e.toString() + " ");
        }
        return result.toString();
    }
}
