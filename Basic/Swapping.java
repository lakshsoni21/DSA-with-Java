public class Swapping{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a + " " + b);
        //Now i want to exchange the values of a and b a=10; b=5
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}