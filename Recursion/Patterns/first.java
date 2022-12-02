public class first{

    static void print(int row, int col){
        if(row == 0){
            return;
        }

        if(col > row){
            System.out.println();
            print(row-1, 1);
        } else {
            System.out.print("*");
            print(row, col+1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print(n, 1);
    }
}