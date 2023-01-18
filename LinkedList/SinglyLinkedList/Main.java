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

        LL list2 = new LL();
        list2.insertFirst(1);
        list2.insertFirst(2);
        list2.insertFirst(3);
        list2.insertFirst(4);
        list2.insertFirst(5);
        list2.insertFirst(6);
        list2.display();
        list2.headAndTail();
        // list2.sort();
        list2.reverseIterative();
        list2.display();
        list2.headAndTail();

        LL list3 = new LL();
        list3.insertFirst(5);
        list3.insertFirst(4);
        list3.insertFirst(3);
        list3.insertFirst(2);
        list3.insertFirst(1);
        list3.display();

        list3.reverseBetween(2, 4);
        list3.display();

        LL list4 = new LL();
        list4.insertFirst(5);
        list4.insertFirst(4);
        list4.insertFirst(3);
        list4.insertFirst(2);
        list4.insertFirst(1);
        list4.display();
        System.out.println(list4.isPalindrome());

        LL list5 = new LL();
        list5.insertFirst(7);
        list5.insertFirst(6);
        list5.insertFirst(5);
        list5.insertFirst(4);
        list5.insertFirst(3);
        list5.insertFirst(2);
        list5.insertFirst(1);
        list5.display();
        list5.reorder();
        list5.display();

        LL list6 = new LL();
        list6.insertFirst(6);
        list6.insertFirst(5);
        list6.insertFirst(4);
        list6.insertFirst(3);
        list6.insertFirst(2);
        list6.insertFirst(1);

        list6.display();
        list6.reverseK(3);
        list6.display();

        LL list7 = new LL();
        list7.insertFirst(9);
        list7.insertFirst(8);
        list7.insertFirst(7);
        list7.insertFirst(6);
        list7.insertFirst(5);
        list7.insertFirst(4);
        list7.insertFirst(3);
        list7.insertFirst(2);
        list7.insertFirst(1);
        list7.display();
        list7.reverseAlternateK(2);
        list7.display();

        LL list8 = new LL();

        list8.insertFirst(6);
        list8.insertFirst(5);
        list8.insertFirst(4);
        list8.insertFirst(3);
        list8.insertFirst(2);
        list8.insertFirst(1);
        list8.display();
        list8.rotateK(13);
        list8.display();


    }
}
