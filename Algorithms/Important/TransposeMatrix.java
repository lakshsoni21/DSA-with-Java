import java.util.*;
public class TransposeMatrix{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int[rows][col];

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Transpose of Entered Matrix is as follow: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }

    }
}