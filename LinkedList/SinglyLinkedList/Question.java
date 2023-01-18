package SinglyLinkedList;

public class Question {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(1);
        // list.insertFirst(9);
        // list.insertFirst(5);
        // list.insertFirst(3);
        // list.insertRec(0, 7);
        // list.display();

        //To remove duplicates
        // LL list2 = new LL();
        // list2.insertFirst(4);
        // list2.insertFirst(4);
        // list2.insertFirst(3);
        // list2.insertFirst(2);
        // list2.insertFirst(1);
        // list2.insertFirst(1);
        // list2.insertFirst(1);
        
        // list2.display();
        // list2.removeDuplicates();
        // list2.display();
        

        //for merge list
        LL list3 = new LL();
        LL list4 = new LL();
        list3.insertFirst(5);
        list3.insertFirst(3);
        list3.insertFirst(1);

        list4.insertFirst(14);
        list4.insertFirst(9);
        list4.insertFirst(2);
        list4.insertFirst(1);

        list3.display();
        list4.display();
        LL ans = LL.mergeSortedList(list3, list4);
        ans.display();
    }

}
