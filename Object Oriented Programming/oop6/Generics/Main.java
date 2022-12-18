package oop6.Generics;

public class Main {
    public static void main(String[] args) {
        // customArraylist list = new customArraylist();

        // list.add(5);
        // list.add(4);
        // list.add(3);
        // list.add(10);

        // for(int i=1; i<=15; i++){
        //     list.add(2 * i);
        // }
        
        // list.print();
        
        //Custom DataType arraylist
        // customGenericArrayList<String> list2 = new customGenericArrayList<>();
        // list2.add("Hello");
        // list2.print();

        //custom Datatype but the dataType should lies under Numbers
        wildCard<Float> list3 = new wildCard<>();
        list3.add(2.4f);
        list3.print(); 
    }
}
