//Concept --> You will be given matrix of nxn and you are standing at (3,3) or any part you have to count the no of ways that you can reach to the last corner of matrix let's if 3x3 matrix you have to reach from (3,3) to (1,1) 
// You can only move right and down

public class countWays{
    public static void main(String[] args) {

        int ans = count(3,3);
        System.out.println(ans);

    }

    static int count(int r, int c){

        if(r == 1 || c ==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        
        return left + right;
    }

}