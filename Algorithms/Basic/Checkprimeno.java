import java.util.*;

public class Checkprimeno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("It is a Prime number");
        }
        else{
            System.out.println("It is not a Prime number");
        }

    }
    }
