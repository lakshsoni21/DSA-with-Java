package oop5.Interfaces;

public class newCar {
    //I created our  engine of type Electrical engine
    Engine engine;
    //music player
    Media player;

    //Whenever we create object of Our class
    public newCar(){
        this.engine = new electricEngine();
        this.player = new CDplayer();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void startPlayer(){
        player.start();
    }
    public void stopPlayer(){
        player.stop();
    }


}   
