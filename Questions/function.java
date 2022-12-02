import java.util.*;

//1 function to check wether the number is prime or not

// public class function{

//     public static void printPrime(int n){
//         int x = 0;
//         for(int i=2; i<=n-1; i++){
//             if(n%i==0){ 
//                 x = 1;
//             }
//         }
//         if(x>0){
//             System.out.println("It is not a Prime number");
//         }
//         else{
//             System.out.println("It is a Prime number");
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printPrime(n);
//     }
// }

//2 Check the number is even or not
// public class function{

//     public static void checkEven(int n){
//         if(n%2==0){
//             System.out.println("It is even number");
//         }
//         else{
//             System.out.println("It is not a even number");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         checkEven(n);
//     }

// }

// 3 To print the table of given number
// public class function{

//     public static void printTable(int n){
//         for(int i=1; i<=10; i++){
//             System.out.println(n*i);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printTable(n);
//     }
// }

//Exercise Solutions

//1 To print the average of 3 numbers

// public class function{

//     public static int calculateAverage(int a, int b, int c){
//         return (a+b+c)/3;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers to print the average- ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println("The average of entered three numbers is: " + calculateAverage(a,b,c));
//     }
// }

//2 function to print the sum of all odd numbers from 1 to n.

// public class function{

//     public static int calculateOdd(int n){
//         int sum=0;
//         for(int i=1; i<=n; i++){
//             if(i%2!=0){
//                 sum = sum + i;
//             }
//         }
//         return sum;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number ");
//         int n = sc.nextInt();
//         System.out.println("The sum of odd numbers from 1 to n is: " + calculateOdd(n));
//     }
// }

//3 To print the circumferrence of the circle
// public class function{

//     public static float calculateCircumferrence(int r){
//         float pi = 3.14f;
//         float circumferrence = 2*pi*r;
//         return circumferrence;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of circle: ");
//         int r = sc.nextInt();
//         System.out.println("The Circumferrence of the circle is: " + calculateCircumferrence(r));
//     }
// }

//3 Eligible to vote
// public class function{

//     public static void checkEligible(int age){
//         if(age>18){
//             System.out.println("You are Elligible to Vote ");
//         }
//         else{
//             System.out.println("You are not Elligible to Vote");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your age ");
//         int age = sc.nextInt();
//         checkEligible(age);
        
//     }
// }

//4 x^n
// public class function{

//     public static int calculatePower(int x, int n){
//         int p = 1;
//         for(int i=1; i<=n; i++){
//             p = p*x;
//         }
//         return p;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int x = sc.nextInt();
//         System.out.print("Raise to the power: ");
//         int n = sc.nextInt();
//         System.out.println(x + " Raised to the Power " + n + " is: " + calculatePower(x,n));
//     }
// }

//5 GCD Greatest Common Divisor(Divisor means jo divide kar ra hai) means you take two numbers and you to find the common divisors first then you have to find the greatest from one of them means Greatest Common Divisor First find the common divisor then the Greatest
// public class function{

//     public static void checkGCD(int x, int y){
//         int p = 0;
//         int q = 0;
//         for(int i=1; i<=x; i++){
//             for(int j=1; j<=y; j++){
//                 if(x%i==0 && y%j==0){
//                     if(i==j){
//                         p = i;
//                         q = j;
//                     }
//                 }
//             }
//         }
//         System.out.println(p);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numnbers to know the Greatest Common Divisor ");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         checkGCD(x,y);
//     }
// }

public class function{

    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        System.out.println(calculateSum(a,b));
    }
}