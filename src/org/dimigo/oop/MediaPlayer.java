package org.dimigo.oop;

public class MediaPlayer {
    private int volume;
    private static MediaPlayer instance = new MediaPlayer();
    public MediaPlayer(){};
    public static MediaPlayer getInstance() {
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static void setInstance(MediaPlayer instance) {
        MediaPlayer.instance = instance;
    }
}
