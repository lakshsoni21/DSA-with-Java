import java.util.*;
public class setBit{

    public static String convertToBinary(int decimalNumber) {
        int bitsLength = 0;
        String bits = "";
    
        while (decimalNumber >= 1) {
          if (decimalNumber % 2 == 0) {
            bits += "0";
          } else {
            bits += "1";
          }
    
          decimalNumber = decimalNumber / 2;
          bitsLength++;
        }
    
        String reverseBits = "";
    
        for (int i = bitsLength - 1; i >= 0; i--) {
          reverseBits += bits.charAt(i);
        }
    
        return reverseBits;
      }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        int decimalNumber = n;
        System.out.println("Initial binary is: " + convertToBinary(decimalNumber));

        System.out.print("Position: ");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        System.out.print("1 or 0? : ");
        int numberToSet = sc.nextInt();
        int newNumber = 0;

        if(numberToSet == 1){
            newNumber = n | bitMask;
        } else{
            newNumber = n ^ bitMask;
        }
        
        decimalNumber = newNumber;
        System.out.println("Your new binary is: " + convertToBinary(decimalNumber));

    }
}