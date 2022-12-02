//To import the hashSet
import java.util.HashSet;
public class uniqueSubsequence{

    public static void printUniqueSubsequence(String str, int i, String newString, HashSet<String> nonRepeatable){

        //Base case
        if( i == str.length() ){

            //if aaa is in a hashset then return, if aaa,aa is in hashSet return dont print anything, if aaa,aa,a is in the hashSet then return

            if(nonRepeatable.contains(newString)){
                return;
            }
            
            //if this thing is not included in the hashset then add it to the hashet and then print
            nonRepeatable.add(newString);
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(i);

        //Adding our character in a newString
        printUniqueSubsequence(str, i+1, newString+currentChar, nonRepeatable);
        //Not adding a character in a newString 
        printUniqueSubsequence(str, i+1, newString, nonRepeatable);

    }
    
    public static void main(String[] args) {

        String str = "aaa";
        int i = 0;
        String newString = "";

        //Creating a hashSet 
        HashSet<String> nonRepeatable = new HashSet<>();

        printUniqueSubsequence(str, i, newString, nonRepeatable);

    }
}