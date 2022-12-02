import java.util.*;
public class binaryConversion {

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

  public static int convertToDecimal(String binaryNumber) {
    int x = 1;
    int number = 0;
    int previousNumber = 0;

    for (int i = 0; i <= binaryNumber.length() - 1; i++) {

      for (int j = binaryNumber.length() - 1; j > i; j--) {
        x = 2 * x;
      }

      number = Integer.parseInt("" + binaryNumber.charAt(i));
      number = x * number + previousNumber;
      previousNumber = number;
      x = 1;
    }
    return number;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the decimal number: ");
    int decimalNumber = sc.nextInt();
    System.out.println("Your binary number is: " + convertToBinary(decimalNumber));

    sc.nextLine();

    System.out.print("Enter the binary number: ");
    String binaryNumber = sc.nextLine();
    System.out.println("Your Decimal number is: " + convertToDecimal(binaryNumber));
  }
}
