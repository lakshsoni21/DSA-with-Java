public class Diamond{
    public static void main(String[] args){
        int rows = 4;  
        int spaces = rows - 1;
        int z = 0;

        // for upper half
        for(int i=1; i<=rows; i++){
            //for spaces
            for(int j=spaces; j>=i; j--){
                System.out.print(" ");
            }

            //for stars
            z = 2*i-1;
            for(int j=1; j<=z; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        // for lower half
        for(int i=rows; i>=1; i--){
            //for spaces
            for(int j=spaces; j>=i; j--){
                System.out.print(" ");
            }

            //for stars
            z = 2*i-1;
            for(int j=1; j<=z; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //aap aisa logic likho ki vo i ki value pe depend kar raha ho to jo lower half hai usme sirf i ki value change karne par apka code complete kaam karega agar upper half me 1 to 4 hai outer loop to lower half me outer loop 4 to 1 kardo

    }
}