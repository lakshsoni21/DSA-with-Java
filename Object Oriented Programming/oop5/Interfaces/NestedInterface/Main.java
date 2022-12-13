package oop5.Interfaces.NestedInterface;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(4));
        System.out.println(obj.isEven(5));
        System.out.println(obj.isOdd(3));
        System.out.println(obj.isEven(10));
    }
}
