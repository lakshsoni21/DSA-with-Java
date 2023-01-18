package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        
        CLL list = new CLL();

        //Inserting the values at first
        // list.insertFirst(17);
        // list.insertFirst(7);
        // list.insertFirst(2);
        // list.display();
        // System.out.println("The size is: " + list.size());
        
        //Inserting the value at Last
        // list.insertLast(10);
        // list.display();
        // System.out.println("The size is: " + list.size());
        
        //Insert the element at particular index
        // list.insert(2, 11);
        // list.display();
        // System.out.println("The size is: " + list.size());

        // list.insert(0,1);
        // list.display();
        // System.out.println("The size is: " + list.size());

        // list.insert(5, 12);
        // list.display();
        // System.out.println("The size is: " + list.size());
        
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        System.out.println(list.size());

        list.delete(1);
        list.display();
        System.out.println(list.size());
        list.head();
        list.tail();

        CLL list3 = new CLL();
        list3.insertFirst(5);
        list3.display();
        list3.delete(0);
        list3.display();
        list3.head();
        list3.tail();

    }
}
