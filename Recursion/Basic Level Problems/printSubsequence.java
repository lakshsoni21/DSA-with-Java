import java.util.HashSet;

public class printSubsequence{

    public static void printSubsequence(String str, int i, String newString){
        if(i==str.length()){
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(i);

        //To add the character
        printSubsequence(str, i+1, newString+currentChar);

        //To not add the character
        printSubsequence(str, i+1, newString);

    }

    public static void main(String[] args) {
        String str = "aaa";
        int i=0;
        String newString = "";
        printSubsequence(str, i, newString);
    }
}