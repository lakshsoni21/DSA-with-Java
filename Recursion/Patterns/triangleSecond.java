public class triangleSecond{

    static void print(int row, int col){
        if(row == 0){
            return;
        }

        if(col > row){
            print(row-1, 1);
            System.out.println();
        } else {
            print(row, col+1);
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        int n = 4;
        print(n, 1);
    }
}