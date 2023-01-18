package Queues;

public class CircularQueue {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;

    // We have two pointers front and end
    // Whenver we insert something we will add at the index = end and end++;
    // Whenever we remove something we will remove the element at data[front] and front++;
    // Our list is between front and end
    // Our end can go back to 0th position if it reaches index out of bound end % data.length;
    // and if the list is full means size == data.length then it will not insert anything
    // Circular Queue does not take much time to remove
    // but normal queue take much time to remove that's why we use circular queue

    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data  = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        // If end reaches out of index then it will be back to 0 
        // 5%5 =0 and other 1 % 5 = 1 etc
        end = end % data.length;
        size++;
        return true;
    }

    // Here we don't need to shift element
    public int remove() throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is Empty cannot remove element!!");
        }

        int deletedNumber = data[front];
        data[front++] = 0;
        // if front reaches index out of bond 
        front = front % data.length;
        size--;

        return deletedNumber;
    }

    public int front() throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is Empty cannot remove element!!");
        }

        return data[front];

    }

    // We have to print the data from front to end
    public void display(){

        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        int i = front;

        do{
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        } while(i != end);

        System.out.println();

    }
}
