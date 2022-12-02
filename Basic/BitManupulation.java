import java.util.*;
public class BitManupulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get bit, set bit, clear bit(0), Update bit

        //Get bit
        // int n = sc.nextInt();
        // int pos = sc.nextInt();
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("0");
        // } else{
        //     System.out.println("1");
        // }

        //Set bit
        // int number = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;
        // int newNumber = bitMask | number;
        // System.out.println(newNumber);

        //clear bit set 0
        // int n = 5;
        // int i = 2;
        // int bitMask = 1<<i;
        // int newNumber = n ^ bitMask;
        // System.out.println(newNumber);

        // int n = 5;
        // int i = 2;
        // int bitMask = 1<<i;
        // int newNumber = n &~bitMask;
        // System.out.println(newNumber);

        //Updation
        System.out.print("Enter the number: ");
        int originalNumber = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        System.out.print("Enter the valur 0 or 1 to Update: ");
        int value = sc.nextInt();

        int bitMask = 1<<position;
        int newNumber = 0;

        if(value==0){
            newNumber = originalNumber ^ bitMask;
            // newNumber = originalNumber &~ bitMask;
        } else{
            newNumber = originalNumber | bitMask;
        }

        System.out.println(newNumber);

    }
}
