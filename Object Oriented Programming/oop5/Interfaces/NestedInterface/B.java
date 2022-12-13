package oop5.Interfaces.NestedInterface;

public class B implements A.nested{
    
    @Override
    public boolean isOdd(int num){

        if(num % 2 != 0){
            System.out.println("The number " + num + " is odd");
            return true;
        }else{
            System.out.println("The number " + num + " is not odd");
            return false;
        }

    }

    @Override
    public boolean isEven(int num){

        if(num % 2 == 0){
            System.out.println("The number " + num + " is even");
            return true;
        } else{
            System.out.println("The number " + num + " is not even");
            return false;
        }

    }

    //Constructor


}
