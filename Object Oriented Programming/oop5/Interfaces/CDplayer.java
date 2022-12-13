package oop5.Interfaces;

public class CDplayer implements Media {
    public void start(){
        System.out.println("Starting the music player");
    }

    public void stop(){
        System.out.println("Stoping the music player");
    }
}
