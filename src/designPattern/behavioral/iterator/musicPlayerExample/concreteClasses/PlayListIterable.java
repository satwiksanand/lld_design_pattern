package designPattern.behavioral.iterator.musicPlayerExample.concreteClasses;

import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Iterator;
import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Music;

public class PlayListIterable implements Iterator<Music> {
    private final PlayList playList;
    private int index = 0;

    public PlayListIterable(PlayList playList){
        this.playList = playList;
    }

    @Override
    public boolean hasNext() {
        return index < playList.getNumOfSongs();
    }

    @Override
    public Music next() {
        return playList.getSongAtInd(index++);
    }
}
