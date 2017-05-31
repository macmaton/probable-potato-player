package abc.music;

public class RepeatSection implements BodyElement {
    private final Line[] repeatedLines;
    private final Line[] endings;

    public RepeatSection(Line[] repeatedLines, Line[] endings) {
        this.repeatedLines = repeatedLines;
        this.endings = endings;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Line r : repeatedLines) {
            result.append(r);
        }
        if (endings != null) {
            result.append("|[1" + endings[0].toString() + ":|");
            for(int i = 1; i < endings.length; i++) {
                result.append("[" + (i+1) + endings[i].toString());
            }
        }
        return result.toString();
    }
}
