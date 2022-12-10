public class Son extends Parent{
    //Overriding the parent class abstract method 
    void carrer(){
        System.out.println("I am going to be a Coder ");
    }

    void partner(){
        System.out.println("I Love xyz");
    }

    //Constructor
    public Son(int age){
        super(age);
    }
}