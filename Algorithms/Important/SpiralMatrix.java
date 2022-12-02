import java.util.*;
public class SpiralMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variable Declaration
        int n = sc.nextInt();
        int m = sc.nextInt();
        int numbers[][] = new int[n][m];

        //Taking the input from the user
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Matrix of Entered array is: ");
        //Spiral matric output
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;

        while(row_start <= row_end && col_start<=col_end){
            //1
            for(int i=col_start; i<=col_end; i++){
                System.out.print(numbers[row_start][i] + " ");
            }
            row_start++;

            //2
            for(int i=row_start; i<=row_end; i++){
                System.out.print(numbers[i][col_end] + " ");
            }
            col_end--;
            //3
            for(int i=col_end; i>=col_start; i--){
                System.out.print(numbers[row_end][i] + " ");
            }
            row_end--;
            //4
            for(int i=row_end; i>=row_start; i--){
                System.out.print(numbers[i][col_start] + " ");
            }
            col_start++;
        }

        //Time complexity of this code is
        // O(n*m)

    }
}