package oop5.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // car.start();
        // car.stop();
        // car.acc();
        // car.brake();

        // Media mediaCar = new Car();
        // mediaCar.stop();

        //So the above code will stop the engine when i press the music stop button so here is problem 
        //to solve that you can create a seperate class for your interface means like you have Media interface
        // now you can create a new class named like CDPlayer and inmplements Media where you override the functions 
        //and you addedd your own body like when we will press stop() then it will stop the music 

        newCar tesla = new newCar();
        tesla.start();
        tesla.stop();
        tesla.acc();
        tesla.startPlayer();
        tesla.stopPlayer();

    }
}
