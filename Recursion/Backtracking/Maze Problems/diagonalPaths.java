public class diagonalPaths{
    public static void main(String[] args) {
        path(3,3,"");
    }

    static void path(int r, int c, String ans){

        if(r==1 && c==1){
            System.out.println(ans);
            return;
        }
        
        if(r>1){
            path(r-1, c, ans+"D");
        }
        if(c>1){
            path(r, c-1, ans+"R");
        }
        if(r>1 && c>1){
            path(r-1, c-1, ans+"H");
        }
        

    }
}