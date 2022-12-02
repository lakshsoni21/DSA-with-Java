//This is a Demo of How to create an object of nonStatic Inner Class

public class Outer{

    //This is a nonStatic Class
    class Inner{
        String name;

        Inner(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {

        //Creating an Object of the Outer Class
        Outer obj1 = new Outer();

        //Creating the Object of the Inner Class
        Outer.Inner obj2 = obj1.new Inner("Laksh Soni");

        System.out.println(obj2.name);

    }
}