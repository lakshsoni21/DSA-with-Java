public class Daughter extends Parent{
    
    static int age;

    void carrer(){
        System.out.println("I am going to be a Doctor ");
    }

    void partner(){
        System.out.println("I Love Iron Man");
    }

    //Constructor
    public Daughter(int age){
        super(age);
    }
}