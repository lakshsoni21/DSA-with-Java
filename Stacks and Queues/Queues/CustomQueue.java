package Queues;

public class CustomQueue {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;

    // 0 means we don't have any element in the array
    int pointer = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data  = new int[size];
    }

    public boolean isFull(){
        return pointer == data.length;
    }

    public boolean isEmpty(){
        return pointer == 0;
    }

    public boolean insert(int item){

        if(isFull()){
            return false;
        }
        // pointer++  = first it will assign the value at pointer then pointer will increase by 1
        // ++pointer = first it will increase the pointer by 1 then it will assign the value at the pointer index
        data[pointer++] = item;

        return true;
    }
    //the item will be removed from the first index 0th
    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int deletedNumber = data[0];
        data[0] = 0;

        // Shift the elements in the Left side
        for(int i=1; i < pointer; i++){
            data[i-1] = data[i];
        }

        pointer--;

        return deletedNumber;
    }

    public void display(){

        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return;
        }

        for(int i=0; i < pointer; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot return front of an empty Queue!!");
        }
        return data[0];
    }
}
