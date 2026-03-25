package designPattern.behavioral.iterator.musicPlayerExample.concreteClasses;

import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Music;

public class FLACMusic extends Music {
    public FLACMusic(String title, int duration) {
        super(title, duration);
    }

    public void play() {
        System.out.println("Playing title: " + getTitle() + " using FLAC format.");
    }
}
