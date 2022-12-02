import java.util.*;
public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String Declaration

        // String name = sc.nextLine();
        // System.out.println(name);

        //String functions which are already created by the java so how to use that?

        //1.Concatenation

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        //2. Length Function
        //stringName.length(); just like we get the length of array

        // System.out.println(fullName.length());

        //3 charAt

        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //4 Compare
        // string1.compareTo(string2);

        // String name1 = sc.nextLine();
        // String name2 = sc.nextLine();

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // }
        // else if(name1.compareTo(name2) > 0){
        //     System.out.println("String 1 is greater than String 2");
        // }
        // else if(name1.compareTo(name2) < 0){
        //     System.out.println("String 1 is smaller than String 2");
        // }

        //We already have == thing to compare two things so why java created the .compareTo function

        // String name3 = "batman";
        // String name4 = "batman";
        // if(name3==name4){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        //This code will run and print Strings are equal batman==batman thats right but kabhi kabhi ye == wali chiz nahi work karti strings ke sath

        //there is also other method to declare the string -
        // new String("batman") this method don't create variable it is Object

            // if(new String("batman") == new String("batman")){
            //     System.out.println("Strings are Equal");
            // } else{
            //     System.out.println("String are not equal");
            // }


        //5 Substring
        //ye begining index se leke ending index tak jo bhi string hai usko fetch karlega
        //stringName.substring(begining index, endingindex)
        //begining index = kaha se start karna hai
        //ending index = kaha tak end karna hai

        // String sentence = "My name is laksh";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        String sentence = "lakshsoni";
        String name = sentence.substring(0, 5);
        System.out.println(name);
        String lastName = sentence.substring(5); 
        System.out.println(lastName);

        //6 Parsing concept help us to convert int to string and string to int read about it

        //1 Convert String to int 
        // int variableName = Integer.parseInt(stringName);

        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        //2 Int to String
        // String variableName = Integer.toString(int vale ke variableName);
        
        int number = 1234;
        String str = Integer.toString(number);
        System.out.println(str);
        System.out.println(str.length());
        






    }
}