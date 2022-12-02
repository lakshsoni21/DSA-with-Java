public class reverseString{
    public static void main(String[] args) {
        String str = "1824";

        reverse(str, 0);
    }

    static void reverse(String str, int i){
        if(i == str.length()-1){
            System.out.print(str.charAt(i));
            return;
        }

        reverse(str, i+1);
        System.out.print(str.charAt(i));

    }

}