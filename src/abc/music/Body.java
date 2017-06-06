package abc.music;

//TODO: test

import java.util.Arrays;

/**
 * An immutable data type representing the body of a piece of music in abc notation
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public class Body {
    private final BodyElement[] elements;

    public Body(BodyElement[] elements) {
        this.elements = elements;

        checkRep();
    }

    public BodyElement[] getElements(){
        return Arrays.copyOf(elements, elements.length);
    }

//    @Override
//    public boolean equals() {
//        TODO
//    }

//    @Override
//    public int hashCode() {
//        TODO
//    }

//    @Override
//    public String toString() {
//        TODO
//    }

    private void checkRep() {
        assert this.elements != null;
        assert this.elements.length > 0;
        for (int i = 0; i < this.elements.length; i++) {
            assert this.elements[i] != null;
        }
    }
}