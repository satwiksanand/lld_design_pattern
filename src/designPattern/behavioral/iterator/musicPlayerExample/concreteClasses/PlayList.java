package designPattern.behavioral.iterator.musicPlayerExample.concreteClasses;

import designPattern.behavioral.iterator.musicPlayerExample.interfaces.IterableCollection;
import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Iterator;
import designPattern.behavioral.iterator.musicPlayerExample.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements IterableCollection<Music> {
    private final List<Music> songs = new ArrayList<>();

    public void addSong(Music music){
        songs.add(music);
    }

    public int getNumOfSongs() {
        return songs.size();
    }

    public Music getSongAtInd(int index){
        if(index < 0 || index >= getNumOfSongs()){
            return null;
        }
        return songs.get(index);
    }

    @Override
    public Iterator<Music> createIterator() {
        return new PlayListIterable(this);
    }
}
