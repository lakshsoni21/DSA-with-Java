package oop5.Interfaces.practice;

public class electricEngine implements Engine{

    public void start(){
        System.out.println("A Electrical Engine Starts");
    }

    public void stop(){
        System.out.println("A Electrical Engine Stops");
    }

    public void acc(){
        System.out.println("A Electrical Engine accelerate");
    }

    public void gears(){
        System.out.println("Automatic Gears");
    }

}
