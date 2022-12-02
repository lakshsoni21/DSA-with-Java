import java.util.*;
public class combineLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating Array
        System.out.print("Enter the Size of array: ");
        int size = sc.nextInt();
        String names[] = new String[size];


        //Taking the input from the user
        sc.nextLine();//to take input form the user after an int input always use first nextLine();
        System.out.println("Enter the Strings: ");

        int totalLength = 0;
        for(int i=0; i<size; i++){
            names[i] = sc.nextLine();

            totalLength += names[i].length();
            //totalLength = totalLength + names[i].length();

        }

        System.out.println("The combined length of the Strings is: " + totalLength);

    }
}