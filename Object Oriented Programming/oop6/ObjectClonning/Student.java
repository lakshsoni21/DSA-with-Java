

//To clone the object automatically you should implements Cloneable interface
public class Student implements Cloneable {

    int age;
    String name;
    int arr[];

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{2,3,8,10};

    }

    //Manually Cloning the Object
    // public Student(Student other){
    //     this.name = other.name;
    //     this.age = other.age;
    // }

    //This method will clone the object with the help of Object class
    //Why we throws Exception here
    //We throws exception here because the clone() containes the exception in the object class you can
    //checkout pressing f12 + left click on the clone() method that's why we have to throws throws CloneNotSupportedException  here

    public Object clone() throws CloneNotSupportedException {
        //This is Shallow Copying
        return super.clone();
    }
}
