package oop5.Interfaces.practice;

public class normalEngine implements Engine{

    public void start(){
        System.out.println("A normal Engine Starts");
    }

    public void stop(){
        System.out.println("A normal Engine Stops");
    }

    public void acc(){
        System.out.println("A normal Engine accelerate");
    }

    public void gears(){
        System.out.println("Manual Gears");
    }
    
}
