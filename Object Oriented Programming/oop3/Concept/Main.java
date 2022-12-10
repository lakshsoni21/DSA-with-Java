public class Main{
    public static void main(String[] args) {
        // Human human = new Human();
        // Child boy = new Child();

        // System.out.println(human.age);
        // System.out.println(boy.age);

        // Human h1 = new Child();
        // System.out.println(h1.age);

        //As you know parent class cannot access the properties of the child class
        //Here Referrence variable type is of Child which is child class and the object is of type Human which is parent class so how can i access the Properties of the child class when im having the object of the parent class 
        Child h2 = new Human();
        System.out.println(h2.age);
    }
}