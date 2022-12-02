//This is a code of Singleton class, How to create a singleton class

public class SingleTon{

    //Creating an instance variable of SingleTon Class
    int marks;

    //Creating a Default Constructor as a private non one can access this constructor from the files other than this file
    private SingleTon(){

    }

    //By defualt this will assign as null
    private static SingleTon instance;

    private static SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }

        //The if condition does'nt satisfied it means that object is already created it is not null so return the same object id 
        return instance;//It will return the same object id
    }

    public static void main(String[] args) {

        //Creating First Object
        SingleTon obj1 = SingleTon.getInstance();
        obj1.marks = 10;
        System.out.println(obj1.marks);

        SingleTon obj2 = SingleTon.getInstance();
        System.out.println(obj2.marks);

        obj1.marks = 50;
        System.out.println(obj1.marks);
        System.out.println(obj2.marks);
    }

}