import java.util.*;
public class replaceCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String substr = "";
        int initial = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e'){
                substr = str.substring(initial,i);
                System.out.print(substr + 'i');
                initial = i+1;
            }
        }

        System.out.print(str.substring(initial));

        //Logic 2
        //String result = "";
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) == 'e'){
        //         result = result + 'i';
        //     } else{
        //         result = result + str.charAt(i);
        //     }
        // }
        // System.out.println(result);

    }
}