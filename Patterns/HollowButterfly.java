public class HollowButterfly{
    public static void main(String[] args){

        int rows = 5;
        int spaces = 2*rows-2;
        for(int i=1; i<=rows; i++){

            for(int j=1; j<=i; j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            spaces = spaces - 2;

            for(int j=1; j<=i; j++){
                if(i==j || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

    }


}