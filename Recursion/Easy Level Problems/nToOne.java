public class nToOne{
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        //isme call pre call lagai hai kyuki chadte vakt print karna hai
        if(n==0){
            return;
        }

        System.out.println(n);
        print(n-1);

        //If you want to print 1 to n
        //utarte vakt print karenge base case se return hoga 1,2,3,4,5 
        // print(n-1);
        // System.out.println(n);

        //Wanna print both 1 to n and n to 1
        //chadte hue bhi print krvate rehne or jab uterte vakt bhi print krvate rahena
        // System.out.println(n);
        // print(n-1);
        // System.out.println(n);
    }

}