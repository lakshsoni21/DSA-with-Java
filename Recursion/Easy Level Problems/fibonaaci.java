//To find the nth number at fibonaaci series

import java.util.*;

public class fibonaaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonaaci(n));
    }

    public static int fibonaaci(int n){

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int first = fibonaaci(n-1);
        int second = fibonaaci(n-2);
        return first + second;
    }

}