public class NKnights{

    static int counter=0;

    public static void main(String[] args) {

        int n = 3;
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }

        knight(board, 0, 0, n);
        System.out.println("The number of ways to place " + n + " Knights in " + n + "x" + n + " is : " + counter);
    }

    static void knight(char board[][], int r, int c, int k){

        //Base Case
        if(k == 0){
            display(board);
            System.out.println();
            counter++;
            return;
        }

        if(r == board.length-1 && c == board.length){
            return;
        }

        //If you reached at column tha't doesn't exsist via c+1 then move to the next row and 0 column 
        if(c == board.length){
            knight(board, r+1, 0, k);
            return;
        }

        //Check the cell is it safe to place knight here if yes then place it and move to the next column
        if(isSafe(board,r,c)){
            board[r][c] = 'K';
            knight(board, r, c+1, k-1);
            board[r][c] = 'X';
        }

        //If the if condition does'nt execute then move to the next column
        knight(board, r, c+1, k);

    }

    static boolean isSafe(char board[][], int row, int col) {

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1] == 'X') {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2] == 'X') {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1] == 'X') {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2] == 'X') {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(char[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    static void display(char[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}