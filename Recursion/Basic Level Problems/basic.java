public class basic {

    // public static void sum(int n, int i, int sum){
    //     if(n == i){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     sum(n, i+1, sum);
    //     System.out.println(i);
    //     System.out.println(sum);
    // }

    // public static int factorial(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return n*(factorial(n-1));
    // }

    // public static void fibonaaci(int n, int i, int a, int b){
    //     if(i == n-1 || n==1){
    //         return;
    //     }
    //     int c = a+b;
    //     System.out.print(c + " ");
    //     fibonaaci(n,i+1,b,c);//I swapped here a=b, and b=c
        
    // }

    // public static int xtoThePower(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }

    //     return x * (xtoThePower(x, n-1));

    // }

    public static int xPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        if(n%2 == 0){
          return xPower(x, n/2) * xPower(x, n/2);
        } else{
          return xPower(x, n/2) * xPower(x, n/2) * x;
        }

    }

  public static void main(String[] args) {
    //Sum of natural number
    // sum(5, 1, 0);
    //Factorials
    // System.out.println(factorial(5));
    //Fibonacci

    // int n = 5;
    // int a = 0;
    // int b = 1;
    // int i = 1;
    // System.out.print(0 + " " + 1 + " ");
    // fibonaaci(n,i,a,b);

    //x^n
    // int n = 2;
    // int x = 5;
    // System.out.println(xtoThePower(x,n));

    //x^n stack height logn
    // int x = 2;
    // int n = 4;
    // System.out.println(xPower(x,n));


  }
}
