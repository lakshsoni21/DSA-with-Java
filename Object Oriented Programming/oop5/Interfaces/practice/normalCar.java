package oop5.Interfaces.practice;

public class normalCar{
    Engine engine;
    normalCar(){
        this.engine = new normalEngine();
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

    public void gears(){
        engine.gears();
    }

    public void upgradeEngine(){
        this.engine = new electricEngine();
    }
}
