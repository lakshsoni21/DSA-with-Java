
        for(int i=rows; i>=1; i--){

            spaces = 2*(rows-i);

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();

        }