package oop5.Interfaces;

public class Car implements Engine,Brake, Media{
    @Override
    public void brake(){
        System.out.println("I have normal brake");
    }
    @Override
    public void start(){
        System.out.println("I have normal start button to start engine");
    }
    @Override
    public void stop(){
        System.out.println("I have normal stop button to stop engine");
    }
    @Override
    public void acc(){
        System.out.println("I have fast accelerator");
    }
}
