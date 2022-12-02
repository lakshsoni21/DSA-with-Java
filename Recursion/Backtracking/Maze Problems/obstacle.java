public class obstacle{
    public static void main(String[] args) {
        boolean matrix[][] = new boolean[3][3];
        matrix[1][1] = true;
        path(0,0,matrix,"");
    }

    static void path(int r, int c, boolean matrix[][], String ans){

        if(r == 2 && c == 2){
            System.out.println(ans);
            return;
        }


        if(r < 2 && matrix[r][c] == false){
            path(r+1, c, matrix, ans+"D");
        }
        if(c < 2 && matrix[r][c] == false){
            path(r, c+1, matrix, ans+"R");
        } else{
            return;
        }
        

    }
}