package designPattern.behavioral.iterator.musicPlayerExample.concreteClasses;

import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Music;

public class Mp3Music extends Music {
    public Mp3Music(String title, int duration){
        super(title, duration);
    }

    public void play(){
        System.out.println("Playing title: " + getTitle() + " using mp3 format.");
    }
}
