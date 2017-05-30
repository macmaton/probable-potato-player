package abc.music;

/**
 * From https://ocw.mit.edu/ans7870/6/6.005/s16/projects/abcplayer/spec/
 *
 * One or more notes may be played simultaneously in a chord. In abc, a chord is denoted by a group of notes between
 * square brackets ( [ and ] ):
 *  [CEG]
 * Notes within a chord may be embellished with an accidental or a multiplicative factor.
 * If the notes in a chord have different durations, the duration of the chord is determined by the duration of the
 * first note specified in the chord. For example, in [C2E4]G2 , there would first be an E note and a C note playing together, and then an E note and a G note playing together.
 *
 * A chord may not contain any rests or tuplets.
 */
public class Chord implements Music {
    //TODO: rep

}