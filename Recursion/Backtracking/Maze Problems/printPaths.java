//You have to print paths of same concept in countWays there you have to count the ways to reach at the target but here you have to print the paths

import java.util.ArrayList;

public class printPaths{
    public static void main(String[] args) {
        String ans = "";
        printPaths(3,3,ans);
    }

    static void printPaths(int r, int c, String ans){

        if(r == 1 && c == 1){
            System.out.println(ans);
            return;
        }

        //We cannot go down if we reaches at r=1 so that's why we added the if condiiton
        //when r=1 only right call will be going on no left call
        if(r > 1){
            printPaths(r-1, c, ans+"D");
        }
        if(c > 1){
            printPaths(r, c-1, ans+"R");
        }

    }

}