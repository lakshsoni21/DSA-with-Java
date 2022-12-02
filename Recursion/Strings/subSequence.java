public class subSequence{

    
    static void ans(String main, String ans, int i){

        //Base Case
        if(i == main.length()){
            System.out.println(ans);
            return;
        }

        //Selecting the current character
        char ch = main.charAt(i);

        //Adding that current character
        ans(main, ans+ch, i+1);

        //Skipping the current character
        ans(main, ans, i+1);
    }

    public static void main(String[] args) {
        String main = "abc";
        ans(main, "", 0);
    }
}