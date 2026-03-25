package designPattern.behavioral.iterator.musicPlayerExample.interfaces;

public abstract class Music {
    private final String title;
    private final int duration;

    public Music(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public abstract void play();
}
