package oop6.EzceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        //Try, Catch, Finally keyword
        try{
            // int c = a / 0; 
            divide(a, b);   
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("This will print whatever happens");
        }

        //Testing my own exception
        try{

            String name = "laksh";

            if(name.equals("laksh")){
                throw new MyException("My name occurs");
            }

        } catch(MyException e){
            //This will print the message of the exception
            System.out.println(e.getMessage());
        }
      

    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("You cannot divide by zero");
        }

        return a / b;
    }

}
