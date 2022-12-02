
//public static void main(String[] args){}
//public static is main its written in all the functions
//void is means by returntype void returns empty you can give int, float etc to return to output from a function
//main is the function name it means whnever the main comes the code will execute first this function main is the functionname you can write any function name you want to like PrintSum, etc
//inside the () you write the arguments means the typeOfinput then the name of variable it will take the input
//Syntax -: public static returnType fucnctionName(inputType variable, inputType variable){Operations}
//In void returnType the function will automatically return you dont have to write it
//Functions hum tab bolenge directly call karte hai
//Methods hum tab bolenge jab hum class ke objects ko call karenge
// lets take an example

import java.util.*;

//Function to Print the name
// public class function{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;//return ka matlab hai functions se exit ho jao
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);//function ko call kiya yaha par main function me 
//     }
// }

//Function to print the sum of two numbers
// public class function{

//     public static int printSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = printSum(a,b);
//         System.out.println(sum);
//     }
// }

//Function to multiply the product of two number
// public class function{
//     public static int printProduct(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The Product of two numbers is: " + printProduct(a,b));
//     }
// }

//*Function to find the factorial of number
public class function{
    public static void calculateFactorial(int a){
        int factorial = 1;
        if(a<0){
            System.out.print("Invalid Number");
            return;

        }
        else if(a==0){
            System.out.println("1");
            return;
        }
        else{
            for(int i=a; i>=1; i--){
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        calculateFactorial(a);
    }
}