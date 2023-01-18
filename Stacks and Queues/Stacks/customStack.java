package Stacks;

import java.beans.Expression;

public class customStack {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    private int pointer = -1;

    customStack(){
        this(DEFAULT_SIZE);
    }

    customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int num){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        pointer++;
        data[pointer] = num;
        return true;
    }

    protected boolean isFull(){
        // Pointer is at last index
        return pointer == data.length-1;
    }
    private boolean isEmpty(){
        // Pointer is at last index
        return pointer == -1;
    }

    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Cannot pop from the empty stack!!");
        }

        int deletedNumber = data[pointer];
        data[pointer] = 0;
        pointer--;
        return deletedNumber;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek because stack is empty");
        }

        return data[0];
    }

    public void display(){

        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return;
        }

        for(int i=0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}
