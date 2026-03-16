package designPattern.structural.adaptor;


import java.util.Scanner;

public class AdaptorTester {
    private static Scanner input;

    public static void main(String[] args){
        input = new Scanner(System.in);
        MediaPlayer player1 = new Mp3Player();
        MediaPlayer player2 = new Mp4PlayerAdaptor(new Mp4Codec());
        MediaPlayer player3 = new VlcPlayerAdaptor(new VlcCodec());

        String song;

        System.out.println("Enter a song of your choice");
        song = input.nextLine();

        player1.play(song);
        player2.play(song);
        player3.play(song);

        input.close();
    }
}
