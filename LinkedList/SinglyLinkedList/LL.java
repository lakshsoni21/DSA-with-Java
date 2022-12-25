package SinglyLinkedList;

public class LL {

    //Our linked list have these three variables
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    //To Add element in the first index
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;

    }

    //To add element in the last index
    public void insertLast(int value){

        //If tail is pointing to the null object means there is no element in the list so
        //call the insertFirst() method
        if(tail == null){
            insertFirst(value);
            //After calling the method it will do its work then the code will execute from next line so that's why we use return
            //keyword here
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //To add the element at the particular index
    //Remember that in these function i assume the starting index here is 0, It's your choice 
    //You can write these function also that will work on starting index=1 its your choice
    //and the size of linked list will be start counting from 1 just like arrays size 
    public void insert(int index, int value){

        if(index > size){
            System.out.println("Check the size");
            return;
        }

        if(index == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        Node before = head;

        for(int i=0; i<index; i++){

            if(i==index-1){
                before = temp; 
            }

            temp = temp.next;
        }

        before.next = node;
        node.next = temp;
        size++;

    }

    //To Delete the element at particular index
    public int delete(int index){

        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        //the toDelete will point out to the object that you insert the index
        Node toDelete = get(index);
        int value = toDelete.value;
        //The before will point out to the object of index-1
        Node before = get(index-1);
        //Inside the before object there is next variable inside that, so the next variable is pointing out to 
        //the object that we want to delete so we modified that
        //now the next variable will point out to the toDelete.next object
        before.next = toDelete.next;
        toDelete = null;
        size--;
        return value;
    }

    //This Method will delete the first element and returs the value
    public int deleteFirst(){

        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return value;
    }

    //This method will delete the last item of the list
    public int deleteLast(){

        int value = tail.value;
        Node secondLast = head;
        //This for loop will traverse the last second element
        //after that the last second element will be tail
        for(int i=0; i < size-2; i++){
            secondLast = secondLast.next;
        }
        tail = secondLast;
        //The second last elment will point out to the null because the last element is delted so there is no element present
        //Now this will remove by Garbage collector later on
        tail.next = null;
        size--;
        return value;

    }

    //It will point out to the object of the index you put on
    public Node get(int index){
        Node node = head;
        for(int i=0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    //To get a value at a particular index
    public int getValue(int index){

        if(index >= size){
            System.out.print("Index out of bound ");
            return index;
        }

        int value = get(index).value;
        return value;
    }

    //To get a node object with the help of value
    public Node find(int value){

        Node node = head;
        while(node != null){
            
            if(node.value == value){
                return node;
            }

            node = node.next;
        }

        return null;

    }

    //To Disply our list
    public void display(){
        //A reference variable named temp is pointing out to the object that head is pointing out to
        //example like head is pointing out to the object which have value = 3 then temp will also point out to the same
        //object that head is pointing means temp.value = 3; temp is pointing out to the object that have value=3

        Node temp = head;

        //Loop jab tak chalana hai tab tak temp null nahi hojata, temp jaise hi null object ko point out karega 
        //loop stop ho jayega
        while(temp != null){

            System.out.print(temp.value + " --> ");
            //After printing the current object, you know temp is pointing out to the current head object 
            //so inside that object there is a next vairble that is pointing out to the next object of LinkedList
            //Then temp will point out to the next object with the help of temp.next
            //because temp is pointing out to an object that contains next reference varaible which is pointing out to object that is
            //next, so temp will point out to the next object
            temp = temp.next;

        }
        System.out.println("END");
    }

    //To print the size of out list
    public void size(){
        System.out.println("The size of your linked list is: " + size);
    }
    
    //Here the object will be created for each element 
    //means here our elments are stored in the object
    //and object is linked and its a singly linked list
    //like 3,4,5,6 the object that contain value 3 will be point to value=4 object vice versa
    //3->4->5->6 its linked only one sided 
    //This we will study in next Lecture 3 <-> 4 <-> 5 <-> 6

    //Basically our object Will be of Class Node and in that object there are instance variables 
    //value --> This will store the value like 3,4
    //Node next --> This is a object named "next" which is byDefault is pointing out to the null object 
    //the next reference variable will be pointing out to the next object that is linked with current object 
    //means 3-->4 here the object that contain value=3, have instance "next" reference variable which will point to the object
    //that contain value=4 
    //and the object that contain value=4 have instance "next" reference variable but this next will point out to the null object
    //because this is a last element in the list

    private class Node {

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
