package DoublyLinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public void DLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        //Creating our new node
        Node node = new Node(value);
        //node.next will be pointing out where head is pointing out to
        node.next = head;
        node.prev = null;

        //I have to add here the check of null because if there is an empty list
        //then i want to add the element first time and i don't add here the if condition
        //what will happen? --> head.prev = node and When the list is empty
        //The head will point out to null and tail also in, null.prev = node that will give error
        //because there is no object there is null so there you cant do that that's why i added if check here

        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void insertLast(int value){

        if(size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int value){

        if(index >= size){
            System.out.println("Check the index, Index out of bound");
            return;
        }

        if(index == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        Node currentElement = get(index);
        Node previousElement = get(index-1);

        node.next = currentElement;
        node.prev = previousElement;
        previousElement.next = node;
        currentElement.prev = node;

        size++;

    }

    //Insert the value after the give value
    //eg --> 2-->5-->8--> 9 list.insertAfter(8,6)
    //So this will insert the 6(value) between the 8 and 9
    //ans = 2-->5-->8-->6-->9

    public void insertAfer(int after, int value){
        //just insert that thing in index+1 the current value will move forward out task achieved 
        //find the index of the after value
        int index = getIndex(after);

        if(index == size){
            return;
        }

        insert(index+1, value);
        return;
    }

    //It will return the index of the value that we entered
    public int getIndex(int value){
        Node node = head;
        int counter = 0; //for index

        //My loop will be running until I didn't find my value that's why i write this node.value !=value
        while(node.value != value){

            node = node.next;
            counter++;

            if(node == null){
                System.out.println("The value didn't exist");
                return counter;
            }

            //After node = node.next if our node reached at null object means at last, then it means that 
            //we traverse our whole LinkedList and we can't find that value means --> That value didn't exist in the List
            //IF i added this IF() condtion above the node=node.next line it will give error why??
            //because when the node is moved to the null part and then it enters in the while() condition there 
            //is node.value this will give error because the null object don't have the instance variable named "value"
            //so that's why I added this IF condition before exiting the while loop
            //The node will update to the next and then when it is leaving the while loop we added the if condition 
            //and this if condition will print something and exit from the function

        }
        return counter;
    }

    //Get the Object node with the help of index
    public Node get(int index){

        if(index < 0){
            return null;
        }

        if(index >= size){
            if(index > size){
                System.out.println("Index does not exist, Index out of bound");
            }
            return null;
        }

        Node node = head;

        for(int i=0; i < index; i++){
            node = node.next;
        }

        return node;

    }

    //Deleting the value at a particular index
    public int delete(int index){
        Node currentElement = get(index);
        Node beforeElement = get(index-1);
        Node afterElement = get(index+1); 

        if(beforeElement != null){
            beforeElement.next = afterElement;
        }

        if(afterElement != null){
            afterElement.prev = beforeElement;
        }

        currentElement.next = null;
        currentElement.prev = null;

        if(index == size-1){
            tail = beforeElement;
        }

        if(index == 0){
            head = afterElement;
        }

        size--;

        return currentElement.value;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public int size(){
        return size;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
