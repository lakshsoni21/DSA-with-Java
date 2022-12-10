public class Main{
    public static void main(String[] args) {

        //Demo of hashCode method ()
        // ObjectDemo obj = new ObjectDemo(34);
        // System.out.println(obj.hashCode());

        ObjectDemo obj1 = new ObjectDemo(12);
        ObjectDemo obj2 = new ObjectDemo(12);
        // ObjectDemo obj2 = obj1;

        // if(obj1 == obj2){
        //     System.out.println("They are equal");
        // }
        
        //equals( ) method
        if(obj1.equals(obj2)){
            System.out.println("They are equal");
        }

        //Instance Of Operator
        // System.out.println(obj1 instanceof ObjectDemo);
        // System.out.println(obj1 instanceof Object);

        //getClass() method
        //This method is final inside the Object Class so we can't override this method we can only use this
        System.out.println(obj1.getClass());
    }
}