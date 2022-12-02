import java.util.*;
public class keypadCombination {

	public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

	public static void printKeypad(String inputKeys, String ans){
		//Base case
		if(inputKeys.length() == 0){
			System.out.println(ans);
			return;
		}

		char charOfInput = inputKeys.charAt(0);
		String wait = inputKeys.substring(1); //if input=23, then the expect 2, 3 will pass in the next  
		String lettersForKey = keypad[charOfInput - '0'];//Asci code it will take the string so we have to convert this string into int so the array can access so what it will do it will convert the 'anyNumber' you have it will convert it into asci code so to ignore that we have - with '0' so we can get the asci code write what we want like '6'-'0'=6, or '6' = 54

		for(int i=0; i < lettersForKey.length(); i++){
			char cho = lettersForKey.charAt(i);
			printKeypad(wait, ans + cho);
		}

	}


  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the keys: ");
	String inputKeys = sc.nextLine();
	printKeypad(inputKeys, "");

  }
}
