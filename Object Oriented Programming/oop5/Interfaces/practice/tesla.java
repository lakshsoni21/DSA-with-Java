package oop5.Interfaces.practice;

public class tesla {
    Engine engine;
    Ac airCondition;

    tesla(){
        this.engine = new electricEngine();
        this.airCondition = new ac();
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

    public void startAc(){
        airCondition.start();
    }
    public void stopAc(){
        airCondition.stop();
    }
}
