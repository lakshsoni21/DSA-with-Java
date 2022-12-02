import java.util.*;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The 1st number ");
        int a = sc.nextInt();

        System.out.print("\nEnter the 2nd number ");
        int b = sc.nextInt();

        System.out.print("\nWhat you want do ");
        String operation = sc.next();

        //Jab bhi nextInt ya kuch bhi nextXYZ ke baad jab tum use karoge nextLine vo input nahi lega skip kar jayega to sc.nextLine(); use karlena string variable declaration se pehle or simple agar ye use nahi karna ho to .next() hi use karlena jaisa maine kiya hai kyuki string thoda sa complex 
        //Reasoning nextInt use karne ke baad jab nextLine use karoge to vo skip kar jayega kyuki nextInt ka jo input hai usko lene ke baad jab enter press karoge tab vo usi line pe rahega nextint ki fir nextline function use hoga to vo automatically empty string as a input lelega kyuki nextint input lene ke baad line vahi hai par usme string empty hai

        switch (operation) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid Button");

        }
    }
}