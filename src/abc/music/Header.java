package abc.music;

/**
 * An immutable data type representing the header of a piece in abc notation
 * 1 - X: index number; 2 - T: title; * - C: composer; * - M: meter; * - L: length -
 * default duration of a note; last - K: key
 */
public class Header {
    //TODO: implementation of header
    private final Index index;
    private final Title title;
    private final Key key;
//    private final Composer composer;
//    private final DefaultNoteLength length;
//    private final Meter meter;
//    private final Tempo tempo;
//    private final Voice[] voices;

    public Header(Index index, Title title, Key key) {
        this.index = index;
        this.title = title;
        this.key = key;

        //TODO: default values when not provided
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Header) {
            Header that = (Header) obj;
            return this.toString().equals(that.toString());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
