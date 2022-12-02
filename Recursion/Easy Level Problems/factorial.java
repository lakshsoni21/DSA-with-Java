import java.util.*;
public class factorial{


  public static void main(String[] args) {
    int n = 5;
    System.out.print("factorial of " + n + "! is :- ");
    System.out.println(factorial(n));
  }

  static int factorial(int n){
    //Base case returning 1 when we happen to reach at 0
    //The factorial of 0! is 1
    if(n==0){
      return 1;
    }

    //chadti vakt multily karke funcitons ko call laga te jao jaise hi base case pe pochega return karega 1 to sari value fill ho ti jayegi back to back
    return n * factorial(n-1); // 5 * factorial(4) bhai 4 tera factorial 4! lake dede 

  }


  }