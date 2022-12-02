public class sudokuSolver{
    public static void main(String[] args) {

        int board[][] = {{5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};

        solve(board, 0,0);
    }

    static void solve(int board[][], int r, int c){

        //BASE CASE

        //When I reach at the last row it will call the new row -> row+1 then display the board we solved the sudoku and return 
        if(r == board.length){
            display(board);
            return;
        }

        //We place all the empty cell in a particular row column by column when we reach at lastCol+1 then simply go to the next row with 0th column do

        if(c == board.length){
            solve(board, r+1, 0);
            return;
        }

        if(board[r][c] == 0){

            for(int i=1; i <= 9; i++){
                
                if(isSafe(board,r,c,i)){
                    board[r][c] = i;
                    solve(board, r, c+1);
                    board[r][c] = 0;
                }
                
            }

            return;

        }

        solve(board, r, c+1);
        return;


    }

    static boolean isSafe(int board[][], int r, int c, int num){

        //Checking the columns
        for(int col = 0; col < board.length; col++){
            if(board[r][col] == num){
                return false;
            }
        }

        //Checking the rows
        for(int row=0; row < board.length; row++){
            if(board[row][c] == num){
                return false;
            }
        }

        //Checking the Sub Matrix
        int rowStart = r - (r % 3);
        int colStart = c - (c % 3);
        for(int row=rowStart; row < rowStart+3; row++){
            for(int col=colStart; col < colStart+3; col++){
                if(board[row][col] == num){
                    return false;
                }
            }
        }

        return true;

    }

    static void display(int board[][]){
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}