public abstract class Parent{
    
    static int age;

    //Creating Constructor
    public Parent(int age){
        Parent.age = age;
    }

    //If One or more abstract methods are present in the class then the class should be declared as an abstract class
    //I only define the abstract method for the body child class will take care
    abstract void carrer();
    abstract void partner();

    //Creating static method
    static void hello(){
        System.out.println("Hello");
    }

    //Creating nonstatic method
    void normal(){
        System.out.println("normal");
    }


}