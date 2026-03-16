package designPattern.structural.adaptor;

public class VlcPlayerAdaptor implements MediaPlayer{
    private final VlcCodec codec;

    VlcPlayerAdaptor(VlcCodec vlcCodec){
        this.codec = vlcCodec;
    }

    public void play(String fileName) {
        codec.playVlc(fileName);
    }
}
