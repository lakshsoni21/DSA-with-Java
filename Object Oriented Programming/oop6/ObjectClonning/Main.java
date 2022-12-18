
import java.util.Arrays;

public class Main{

    //Our clone method contains an Exception may be so we are calling that method from this Class
    //So we have to use throws CloneNotSupportedException here also in main function
    public static void main(String[] args) throws CloneNotSupportedException  {

        Student laksh = new Student("Laksh Soni", 18);

        //Cloning the laksh manually
        // Student clone = new Student(laksh);

        //Autmatically Clone the object
        Student clone = (Student)laksh.clone();
        System.out.println(clone.name + " " + clone.age);
        System.out.println(Arrays.toString(clone.arr));

        //We changed the 0th index of clone object but laksh.arr[0] also changes
        clone.arr[0] = 20;
        System.out.println(Arrays.toString(clone.arr));
        System.out.println(Arrays.toString(laksh.arr));

    }
}