package designPattern.structural.adaptor;

public class Mp4PlayerAdaptor implements MediaPlayer{
    private final Mp4Codec codec;

    Mp4PlayerAdaptor(Mp4Codec codec){
        this.codec = codec;
    }

    public void play(String fileName){
        codec.playMp4(fileName);
    }
}
