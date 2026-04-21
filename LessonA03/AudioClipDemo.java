import sound.Soundclip;

public class AudioClipDemo {
    public static void main(String[] args) {
        Soundclip soundclip = new Soundclip("Media/boing.wav");
        soundclip.open();
        soundclip.play(true);
        soundclip.close();
    }
}
