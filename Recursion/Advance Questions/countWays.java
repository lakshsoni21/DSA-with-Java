public class countWays{
    public static int countPath(int i, int j, int n, int m){
        //Its very simple question to understand how this works you have to make euler tree and analyze the code one by one it means this code recurssion will break the major prblem into sub problem again and again sub problem for sub problem its how this works
        //Base case
        if(i == n-1 || j == m-1){
          return 1;
        }
    
    
        int rightPaths = countPath(i, j+1, n, m);
        int downPaths = countPath(i+1, j, n, m);
    
        return downPaths + rightPaths;
    
    
      }
    
      public static void main(String[] args) {
        int n = 3, m = 3;
        int i = 0, j = 0;
        System.out.print("The number of ways to reach at the point" + "(" + (n-1) + "," + (m-1) + ")" + " is: ");
        System.out.print(countPath(i,j,n,m));
      }
}