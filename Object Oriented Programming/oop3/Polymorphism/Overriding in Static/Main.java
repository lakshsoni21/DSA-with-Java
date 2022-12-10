public class Main{

    public static void main(String[] args) {

        //I can Inherit The Static method
        Parent.greeting();
        
        //But Overriding Cannot happen in Static method because the Static method does not depend on the objects and Overriding Concept is depend on the objects
        Parent obj = new Child();
        obj.greeting();

        Child obj1 = new Child();
        obj1.greeting();
    }

}