import java.util.*;
public class username{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        for(int i=0; i<email.length(); i++){

            if(email.charAt(i)=='@'){
                String username = email.substring(0,i);
                System.out.println("Your username is: " + username);
            }
        }


    }
}