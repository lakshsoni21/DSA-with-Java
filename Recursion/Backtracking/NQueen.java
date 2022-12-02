public class NQueen{
    public static void main(String[] args) {


        int n = 4;
        //Creating our 2D Array which will represent our ChessBoard Q = Queen and X = Empty space  
        char board[][] = new char[n][n];

        //Adding 'X' to the all cell of our nxn matrix

        for(int i=0; i<board.length; i++){

            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }

        }


        queen(board, 0);
        System.out.println("The number of Ways you can Place the queen in " + n + "x" + n + " : " + counter);
    }

    static int counter=0;

    static void queen(char board[][], int r){

        //BASE CASE
        //Whenever we reach at our last row+1 then it means we successfuly placed our Queeen in the right place so we should print our Board

        if(r == board.length){
            //Function that can print our board
            display(board);

            System.out.println();

            counter++;
            return;
        }

        //For each row there should be 4 calls in 4x4 matrix
        //Every time it will check is it Safe to place queen here then if true it will place that Q otherwise move to next column
        //and if in all the column if condition does'nt run all the cell you cannot place the queen due to again and again false
        //Then it will return and place X to the previus row and return and then place X

        for(int c=0; c < board.length; c++){

            if(isSafe(board, r, c)){
                board[r][c] = 'Q';
                queen(board, r+1);
                board[r][c] = 'X';
            }

        }

    }

    //To check wether at (r,c) is there Safe to place the Queen
    static boolean isSafe(char board[][], int r, int c){

        //Checking Vertically
        for(int i=r; i>=0; i--){

            if(board[i][c] == 'Q'){
                return false;
            }

        }

        //Checking Upper left Diagonal
        for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--){

            if(board[i][j] == 'Q'){
                return false;
            }

        }

        //Checking Upper Right Diagonal
        
        for(int i=r-1,j=c+1; i>=0 && j <= board.length-1; i--, j++){

            if(board[i][j] == 'Q'){
                return false;
            }

        }

        return true;

    }

    static void display(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}