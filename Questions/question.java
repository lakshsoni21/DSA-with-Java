import java.util.*;

public class question {

  public static void main(String[] args) {
    //Q1
    /** 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle ");
        int radius = sc.nextInt();
        float pi = 3.14f;
        float area = pi*(radius*radius);
        System.out.println("The Area of the Circle is " + area);
        */

    //Q2
    /** 
        System.out.print("Enter the number which you want the Table ");
        int number = sc.nextInt();
        System.out.println(number);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);
        System.out.println(number*5);
        System.out.println(number*6);
        System.out.println(number*7);
        System.out.println(number*8);
        System.out.println(number*9);
        System.out.println(number*10);
        */

    //Q3
    /** 
        System.out.println("To Print the sum of first nautral number");
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum = sum + i;
        }

        // Nahi Samaj aya??
        // Dekh lets say n=4 inital i=1 i ne condition check kari ke vo 4 se chota hai chalo ab loop me ghuso ab sum=sum+i sum=0 initally to sum=1 ho gya (sum=0+1) ab vapis i update hua to i=2 fir sum ki value ab 0 nahi hai kyu ki tumne redeclare karchuke ho sum=1+2=3 ab new sum ki vlaue 3 aise aise sum ki value redeclare hoti jayegi akhri me sum=6+4=10 ye ans

        System.out.println(sum);
        */

    //Q4 To print the even numbers till n

    /** 
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The Even Numbers are");

        for(int i=1; i <= n; i++){
            if((i%2)==0){
                System.out.println(i);
            }
        }
        */

    //Q5
    /** 
        int n = sc.nextInt();

        do{
            System.out.print("Enter the Marks: ");
            int marks = sc.nextInt();
            if(marks>90){
                System.out.println("This is Good");
                
            }
            else if(marks>60){
                System.out.println("This is also Good");
            }
            else if(marks<60){
                System.out.println("This is Good as Well");
            }
            System.out.print("Enter the number either 0 or 1 ");

            n = sc.nextInt();

        }while(n==1);
        */

    //2 to the power number finder
    // int n = sc.nextInt();
    // int x = 2;
    // boolean isPower = false;

    // for(int i=1; i<=n; i++){
    // x = x*2;
    // if(x == n){
    //   isPower = true;
    //   break;
    // }
    //   if((n & (n-1)) == 0){
    //     isPower = true;
    //   }
    // }
    // if(isPower){
    //   System.out.println("It is the power of 2");
    // }else{
    //   System.out.println("It is not power of 2");
    // }

  }
}
