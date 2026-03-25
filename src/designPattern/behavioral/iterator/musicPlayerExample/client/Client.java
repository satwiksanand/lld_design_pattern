package designPattern.behavioral.iterator.musicPlayerExample.client;

import designPattern.behavioral.iterator.musicPlayerExample.concreteClasses.*;
import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Iterator;
import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Music;

public class Client {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.addSong(new Mp3Music("ik vari aa", 123));
        playList.addSong(new Mp3Music("itni si baat hai", 234));
        playList.addSong(new FLACMusic("pehli dafa", 129));
        playList.addSong(new AACMusic("sahiba", 246));

        Iterator<Music> iter = playList.createIterator();
        while(iter.hasNext()){
            iter.next().play();
        }
    }
}
