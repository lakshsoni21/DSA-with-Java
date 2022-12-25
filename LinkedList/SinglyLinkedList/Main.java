package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        
        //Creating our 1st CustomLlist 
        LL list = new LL();

        //Inserting the elments at the first index
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        //So the list will be --> 17,8,2,3 let's print it
        list.display();

        //Inserting the elment at the last index
        list.insertLast(10);
        list.display();
        list.size();
        System.out.println("-----");

        //Inserting The element at the particular index
        list.insert(3, 12);
        list.display();
        list.size();
        System.out.println("-----");

        //Deleting the element which is at particular index from the linked list with my own logic
        list.display();
        System.out.println("The value " + list.delete(3) + " is deleted from the list");
        list.display();
        list.size();

        //This will delete the first element
        System.out.println("The value " + list.deleteFirst() + " is deleted from the list");
        list.display();
        list.size();

        //This will Delete the last element of the List
        System.out.println("The value " + list.deleteLast() + " is deleted from the list");
        list.display();
        list.size();

        System.out.println(list.getValue(3));
    }
}
