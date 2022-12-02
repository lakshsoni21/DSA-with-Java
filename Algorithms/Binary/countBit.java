import java.util.*;

public class countBit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your number: ");

    //Variable Declaration
    int n = sc.nextInt();
    int x = n;
    int count = 0;
    String bits = "";

    //Logic of counting total no. of bits
    while (x >= 1) {

        //Logic of writing 0 and 1
        if(x%2 == 0){
            bits = bits + "0";
        }else{
            bits = bits + "1";
        }
        //Counting no.of bits
        x = x / 2;
        count++;
    }

    //The length of bits is count = count + 1
    int length = count;
    System.out.println("The Total number of bits are: " + length);

    //Counting for 1 and 0
    int count1 = 0;
    int count0 = 0;

    for (int i = 0; i < length; i++) {
      int bitMask = 1 << i;
      int newNumber = n & bitMask;

      if (newNumber >= 1) {//newNumber will be in decimal thats why >=
        count1++;
      } else {
        count0++;
      }
    }
    System.out.println("The number of 1's in your number is: " + count1);
    System.out.println("The number of 0's in your number is: " + count0);

    System.out.print("Your bits are: ");
    for(int i=bits.length() - 1; i>=0; i--){
        System.out.print(bits.charAt(i));
    }

  }
}
