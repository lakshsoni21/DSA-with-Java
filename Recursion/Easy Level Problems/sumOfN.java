public class sumOfN{
    public static void main(String[] args) {
        int n = 5;
        System.out.print("The Sum of " + n + " numbers is -: ");
        System.out.println(sum(n));
    }

    static int sum(int n){
        //Base case 
        //When 1 is called it will return 1
        if(n==1){
            return 1;
        }

        return n + sum(n-1); //5 + sum(4) bhai 4 sum of 4 numbers lake dede 

    }

}