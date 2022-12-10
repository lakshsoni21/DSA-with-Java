public class main{
    public static void main(String[] args) {
        
        //Creating Objects
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.area();
        circle.area();
        triangle.area();
        square.area();

        //Class is of type Shape and Object is of type Square so we know that it will print
        //My object is of which class --> Square() --> which is child or parent?? --> child class
        //My reference variable is of which class type --> Shapes() means it is of parent class
        //It means that this line is true, it will not give error, 
        //As we know till know it should print the area of the Shapes() class because whatever you are accessing is depend on the Reference vairable type
        //But it will print the area of the Square() class why??
        //Go to notion

        Shapes shape1 = new Square();
        shape1.area();


        //It wil give error, You know already the reason why it is giving error
        // Square shape2 = new Shapes();
        // shape2.area();

    }
}