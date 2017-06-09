package abc.music;

public interface HeaderField extends Music {
    public enum Fields{
        INDEX, TITLE, COMPOSER, METER, DEFAULTNOTELENGTH, TEMPO, VOICE, KEY
    }

    public Fields getType();
}
