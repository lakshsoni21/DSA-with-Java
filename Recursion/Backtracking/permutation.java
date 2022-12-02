public class permutation{

    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println("The total numnber of permutaion is : " + k);
    }

    static int k=0;

    static void permutation(String ans, String str){

        if(str.length() == 0){
            System.out.println(ans);
            k++;
            return;
        }

        char currentChar = str.charAt(0);

        for(int i=0; i<=ans.length(); i++){

            String first = ans.substring(0,i);
            String second = ans.substring(i);
            permutation(first + currentChar + second, str.substring(1)); 
        }

    }
}