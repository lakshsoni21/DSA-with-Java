package oop5.Interfaces;

public class electricEngine implements Engine{

    public void start(){
        System.out.println("Start Electrical engine");
    }

    public void stop(){
        System.out.println("Stop Electrical engine");
    }

    public void acc(){
        System.out.println("I have fast accelerator of Electrical Engine");
    }
}
