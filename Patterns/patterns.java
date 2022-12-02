public class patterns{
    public static void main(String[] args){

        //Solid Rhombus

        // int rows = 5;
        // int col = 9;
        // int spaces = rows-1;

        // for(int i=1; i<=rows; i++){
        //     for(int j=spaces; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=rows; j<=col; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Number Pyramid

        // int rows = 5;
        // int spaces = rows-1;

        // for(int i=1; i<=rows; i++){
        //     for(int j=spaces; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        //Palindromic Number Pyramid
        //Palindromic means front side se or back side se pronounce hoga same g BOB

        // int rows = 10;
        // int z = 1;
        // int spaces = rows-1;
        // for(int i=1; i<=rows; i++){
        //     for(int j=spaces; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }
        
        // //Hollow Rhombus 
        // int rows = 5;
        // for(int i=1; i<=rows; i++){
        //     for(int j=1; j<=rows; j++){
        //         if(i==1 || i==rows || j==1 || j==rows){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Pascals Triangle (Incomplete only half)
        // int rows = 5;
        // for(int i=1; i<=rows; i++){

        //     int spaces = rows-i;
        //     //spaces
        //     for(int j=spaces; j>=1; j--){
        //         System.out.print(" ");
        //     }
        //     //numbers
        //     for(int j=1; j<=i; j++){
        //         if(j%2==0){
        //             System.out.print(" ");
        //         }
        //         else if(j==1){
        //             System.out.print("1");
        //         }
        //         else{
        //             if(j==5){
        //                 System.out.print(i+1);
        //             }
        //             else{
        //                 System.out.print(i-1);
        //             }
        //         }
        //     }

        //     System.out.println();

        // }

        //Half Pyramid
        // int rows = 5;
        // for(int i=1; i<=rows; i++){

        //     //spaces
        //     int spaces = rows-i;
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //Inverted half pyramid
        int rows=4;

        for(int i=1; i<=rows; i++){
            for(int j=rows; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}