public class allPaths {

  public static void main(String[] args) {

    //for TRUE AND FALSE 
    boolean maze[][] = new boolean[3][3];
    //To print the maze that's why we created matrix
    int matrix[][] = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        maze[i][j] = true;
      }
    }

    allDirection(maze, 0, 0, "", matrix, 1);

  }

  static void allDirection(boolean maze[][], int r, int c, String ans, int matrix[][], int k) {

    //BASE CASE
    if (r == 2 && c == 2) {

        matrix[r][c] = k;

        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(ans);
        return;
    }

    if(maze[r][c] == false){
        return;
    }

    //Adding the changes in the maze
    maze[r][c] = false;
    matrix[r][c] = k;

    //CALLS

    //Moving down
    if (r < 2) {
      allDirection(maze, r + 1, c, ans + "D", matrix, k+1);
    }

    //Moving right
    if (c < 2) {
      allDirection(maze, r, c + 1, ans + "R", matrix, k+1);
    }

    //Moving Up
    if (r <= 2 && r > 0) {
      allDirection(maze, r - 1, c, ans + "U", matrix, k+1);
    }

    //Moving left
    if (c <= 2 && c > 0) {
      allDirection(maze, r, c - 1, ans + "L", matrix, k+1);
    }

    //Removing the changes that we made
    maze[r][c] = true;
    matrix[r][c] = 0;

  }
}
