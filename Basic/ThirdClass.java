import java.util.*;

public class ThirdClass{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter Your Age ");
        // int age = sc.nextInt();

        // if(age >= 18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }

        //To judge wether the number is odd or even
        //x%y it means x/y then it will show reminder
        //x/y gives quotient 
        
        // System.out.print("Enter the Number ");
        // int number = sc.nextInt();

        // if( number%2==0 ){
        //     System.out.println("It is Even");
        // }
        // else{
        //     System.out.println("It is Odd");
        // }

        //Q1

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // if(a==b){
        //     System.out.println("Equal");
        // }
        // else if(a>b){
        //     System.out.println("A is greater");
        // }
        // else{
        //     System.out.println("A is Lesser");
        // }

        //Q2

        // int button = sc.nextInt();

        // if(button==1){
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");
        // }
        // else if(button==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Button doesn't Exist");
        // }

        //Switch Case

        int a = sc.nextInt();

        switch (a) {
            case 1://agar a ki value 1 hogi to ye print hoga varna next pe jjump karega
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }


    }
}