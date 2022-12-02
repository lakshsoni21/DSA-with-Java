
//This code is part of Lecture 5
//Understanding of Nested loops thorugh Patterns Question 
//The diagrams of patterns is on the notes of lecture 5 

import java.util.*;
public class patterns{
    public static void main(String[] args){

        //1 Solid Rectangle
        //Outer loop will make rows and inner loop will make columns
        //i=1 pe 
        // for(int i=1; i<=4; i++){
        //     //inner loop
        //     for(int x=1; x<=5; x++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //2 Hollow Rectangle (hint :- pattern dhundo matrix me (rows, column))
        /** 
        int n = 4;
        int m = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                //|| ka matlab agar inmme se koi si bhi condition true hai to print * kardo
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

        //3 Half pyramid
        /** 
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
        */

        //4 Inverted Half pyramid
        /**
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //5 Inverted Half pyramid by 180deg

        /** 
        for(int i=1; i<=4; i++){
            
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            //the j variable will delted after the loop will end
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        
        System.out.println();
        */

        //6 Half pyramid with numbers
        /** 
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        //7 Inverted Half pyramid with numbers
        /** 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
        */

        //8 Floyd's Triangle
        /** 
        int n = 5;
        int number = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + " ");
                number++;   
            }

            System.out.println();
        }
        */

        //9 0-1 Triangle

        /** 
        Variable Declaration
        int n = 5;
        int x = 0;
        int y =0;
        */

        //My Logic
        /** 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                x = i%2;
                y = j%2;
                if(x==0){
                    if(y!=0){
                        System.out.print("0");
                    }
                    else if(y==0){
                        System.out.print("1");
                    }
                }
                else if(x!=0){
                    if(y==0){
                        System.out.print("0");
                    }
                    else if(y!=0){
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
        */

        //Apni kaksha Logic
        /** 
        int sum =0;
        int t = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum = i+j;
                t = sum%2;
                if(t==0){
                    System.out.print("1");
                }
                else if(t!=0){
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        */
    }   
}