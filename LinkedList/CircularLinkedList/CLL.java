package CircularLinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        if(head != null){
            node.next = head;
        }

        if(tail != null){
            tail.next = node;
        }

        head = node;

        if(tail == null){
            tail = node;
        }

        size++;
    }

    public void insertLast(int value){
        if(size == 0){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int value){

        if(index >= size){
            System.out.println("Index out of bound, Index does not exist");
            return;
        }

        if(index == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        Node afterElement = get(index);
        Node previousElement = get(index-1);

        node.next = afterElement;
        previousElement.next = node;
        size++;
    }

  
    //To get the index of particular object
    public int getIndex(Node node){
        Node temp = head;
        int counter = 0;

        while(temp.value != node.value){
            temp = temp.next;
            counter++;
        }
        return counter;

    }

    //To get the Node type object with the help of index
    public Node get(int index){

        Node node = head;

        for(int i=0; i < index; i++){
            node = node.next;
        }

        return node;
    }

    public void delete(int index){

        Node currentNode = get(index);

        if(index == 0 && size == 1){
            head = null;
            tail = null;
            currentNode = null;
            return;
        }

        if(index == 0){
            tail.next = currentNode.next;
            head = tail;
            size--;
            tail = get(size-1);
            return;
        }

        if(index == size-1){
            Node newTail = get(index-1);
            newTail.next = head;
            tail = newTail;
            size--;
            return;
        }

        Node previousNode = get(index-1);
        previousNode.next = currentNode.next;
        size--;
    }

    public void head(){

        if(head == null){
            System.out.println("HEAD is null");
            return;
        }

        System.out.println("HEAD is: " + head.value);
    }
    public void tail(){
        if(tail == null){
            System.out.println("TAIl is null");
            return;
        }

        System.out.println("TAIL is: " + tail.value);
    }

    public void display(){
        Node temp = head;

        if(temp == null){
            System.out.println("The list is empty");
            return;
            
        }

        if(size == 1){
            System.out.println(temp.value);
            return;
        }

        if(head != null){
            do {
                System.out.print(temp.value + " --> ");
                temp = temp.next;
            } while(temp != head);
            System.out.println("HEAD");
        }
    }

    public int size(){
        return size;
    }

    private class Node{
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
