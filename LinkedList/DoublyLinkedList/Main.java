package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(8);
        list.display();
        System.out.println(list.size());

        list.insertLast(12);
        list.display();
        System.out.println("The print in reverse");
        list.displayReverse();

        list.insert(3, 9);
        list.display();
        System.out.println(list.size());

        // list.insert(5, 11);
        // list.display();
        // System.out.println(list.size());

        // list.insert(0, 1);
        // list.display();
        // System.out.println(list.size());


        System.out.println("The index of the value " + 9 + " is " + list.getIndex(9));
        System.out.println("Adding value " + 21 + " After " + 9);
        list.insertAfer(9, 21);
        list.display();
        System.out.println(list.size());

        //We entered the value that dont exist in the list so this will give error
        System.out.println(list.getIndex(32));
        list.insertAfer(32, 6);

        //let's add value 6 after 5
        list.insertAfer(5, 6);
        list.display();
        //Deleteing the values at particular index
        list.delete(3);
        list.delete(0);
        list.display();
    }
}
