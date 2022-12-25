package Collections.Enums;

public class Basic {

    enum Week implements A{

        //These are enum constants
        //they are public, static, and final
        //WHy? we dont want to create object
        //Since its final you can't create child enums
        //The Type is of Week

        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        //A constructor
        Week(){
            System.out.println("The constructor calls " + this);
        }

        //Overriding the class
        public void hello(){
            System.out.println("Hello World");
        }

    }

    public static void main(String[] args) {

        //Internally its like this --> public static final Week Sunday = new Week();

        Week weekday = Week.Sunday;
        // System.out.println(weekday);
        // System.out.println("From 0 to 6 where this lies --> " + weekday.ordinal());

        // Week workDay = Week.Monday;
        // System.out.println("The position of this is --> " + workDay.ordinal());

        weekday.hello();
    }
}
