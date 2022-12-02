//This is the introduction to arrays in java
import java.util.*;
public class arrays{
    public static void main(String[] args)

        int[] marks = new int[3];
        marks[0] = 97;//phy
        marks[1] = 87;//chem
        marks[2] = 85;//maths

        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        //Defining array second method

        // int items[] = {97,88,86};
        // for(int i=0; i<3; i++){
        //     System.out.println(items[i]);
        // }

        //Take the size of the array input from the user
        
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }

        //How to store the values in the arrays at a particular index 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array ");
        // int size = sc.nextInt();

        // int numbers[] = new int[size];
        //Taking the values input from the user
        // for(int i=0; i<size; i++){
        //     System.out.print("Enter the number in location " + i + " ");
        //     numbers[i] = sc.nextInt();
        // }

        //Output
        // System.out.println("The input numbers are: ");
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }

        //Q1 To search the memory address(0,1,2) of a given input number
        //This is Linear Search Algorithm, in whihch we go linearly from box to box straight fashion to search the given value 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int number[] = new int[size];
        
        System.out.println("Enter the numbers: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number from array to search the address: ");
        int x = sc.nextInt();
        for(int i=0; i<number.length; i++){
            if(number[i]==x){
                System.out.print("The given number is stored in this address of memory: ");
                System.out.println(i);
            }
        }

    }
}