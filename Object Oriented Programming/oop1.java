

public class oop1{

    public static void main(String[] args) {

        Student one = new Student("Laksh", 124, 84f);
        System.out.println(one.name);

    }


    //Let's create your own Data Structure
    public static class Student{
        int rno;
        String name;
        float marks;

        Student(){

        }

        Student(String name, int rno, float marks){
            this.name = name;
            this.rno = rno;
            this.marks = marks;
        }

        void convert(Student another){
            this.name = another.name;
            this.rno = another.rno;
            this.marks = another.marks;
        }
    }
}