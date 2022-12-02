public class demoStaticBlock{

public static class demo{
    static int a = 4;
    static int b;
    
    static {
        System.out.println("Inside the Static block");
        b = a * 5;
    }

}
    
    public static void main(String[] args) {
        demo obj1 = new demo();
        System.out.println(demo.a + " " + demo.b);

        demo obj2 = new demo();
        System.out.println(demo.a + " " + demo.b);
    }

}