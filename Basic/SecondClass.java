import java.util.*; //To use the Scanner class to take the input

public class SecondClass {
    public static void main(String[] args) {

        //Output
        
        //System.out.println("Hello World");
        //System.out.print("Hello World with java\n");
        //System.out.print("Hello World with java\nfrom\nLaksh");

        //ln use to give new line after giving an output
        // \n used to give new line after giving an output without using ln

        //Q1
        //System.out.print("*\n**\n***\n****");

        //VARIABLES 1byte=8bits

        // String name = "Bruce Wayne";
        // int a = 25;
        // int b = 10;
        // double price = 25.25;
        // int perimeter = 2*(a+b);
        // int area = a*b;

        // System.out.println(name);
        // System.out.println("Perimeter of Rectangle is " + perimeter);
        // System.out.println("Area of Rectangle is " + area);
        // //You can redeclare variable
        // a = 50;
        // b = 25;
        // perimeter = 2*(a+b);
        // System.out.println("The Perimeter of new rectangle is " + perimeter);
        //To print the variable with string use + 

        //Q2
        // a = 10;
        // b = 5;
        // int ans = (a*b)/(a-b);
        // System.out.println(ans);
        //Java doesnt follow BODMAS rule goes from left to right
        // int ans = a*b/a-b;
        // system.out.println(ans);//Ans will be zero

        //Input

        Scanner sc = new Scanner(System.in);//System.in used to take input while System.out give output
        String name = sc.nextLine();//nextLine used to take afterspace string 
        //nextInt() to take input of integer, nextFloat() to take input of decimal
        System.out.println(name);

        //Q3
        System.out.print("Enter a number ");
        int a = sc.nextInt();
        System.out.print("\nEnter a number ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}