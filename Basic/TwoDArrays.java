import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The importance of 2D arrays is this concept will help a lot to solve the complex programming and in algorithm Dynamic Programming
        //We use indexing the address of a particular cell by matrix concept like a cell we have to write in that so its position is (0,2) This cell is present in the 0 row and 2 column
        //Basic Syntax
        // dataType[][] arrayName = new dataType[rows][columns];
        // dataType arrayName[][] = new dataType[rows][columns]; This is also right
        //Remember - Pehle Rows Fir Columns

        //Declaring the rows and columns
        int rows = sc.nextInt();
        int col = sc.nextInt();

        //Creating Array
        int numbers[][] = new int[rows][col];

        //Adding the values in the arrays from user
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //printing the arrays
        //Outer loop --> Rows
        for(int i=0; i<rows; i++){
            //Inner loop --> columns
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //Searching the given number x and print the position rows,columns
        //Its a Searching Algorithm
        System.out.print("Enter the number to search from the array: ");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(numbers[i][j]==x){
                    System.out.println("The number found at the location " + i + "," + j);
                }
            }
        }
    }
}