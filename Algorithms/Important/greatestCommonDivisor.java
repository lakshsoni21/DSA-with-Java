// GCD Greatest Common Divisor(Divisor means jo divide kar ra hai) means you take two numbers and you to find the common divisors first then you have to find the greatest from one of them means Greatest Common Divisor First find the common divisor then the Greatest
import java.util.*;
public class greatestCommonDivisor {

    public static void checkGCD(int x, int y){
        int p = 0;
        int q = 0;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
                if(x%i==0 && y%j==0){
                    if(i==j){
                        p = i;
                        q = j;
                    }
                }
            }
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numnbers to know the Greatest Common Divisor ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        checkGCD(x,y);
    }
}