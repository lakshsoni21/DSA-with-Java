package oop5.Interfaces.practice;

public class Main {
    public static void main(String[] args) {

        normalCar car1 = new normalCar();
        car1.start();
        car1.stop();
        car1.acc();
        car1.gears();
        System.out.println("----------");

        tesla car2 = new tesla();
        car2.start();
        car2.stop();
        car2.acc();
        car2.gears();
        car2.startAc();
        car2.stopAc();

        System.out.println("----------");
        //Upgrading Engine of a normal car
        car1.upgradeEngine();
        car1.start();
        car1.stop();
        car1.acc();
        car1.gears();
    }
}
