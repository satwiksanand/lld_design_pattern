package designPattern.structural.adaptor;

public class Mp3Player implements MediaPlayer{
    public void play(String fileName) {
        System.out.println("Playing song: " + fileName + " using Mp3Player.");
    }
}
