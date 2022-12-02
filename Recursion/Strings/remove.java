public class remove{

    static void removeA(String str, String ans, int i){

        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        if(str.charAt(i) == 'a'){
            removeA(str, ans, i+1);
        } else{
            ans = ans + str.substring(i, i+1);
            removeA(str, ans, i+1);
        }

    }

    public static void main(String[] args) {
        String str = "baccad";
        removeA(str, "", 0);
    }
}