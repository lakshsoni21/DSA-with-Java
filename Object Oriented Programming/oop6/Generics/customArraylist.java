package oop6.Generics;

public class customArraylist {
    
    //Creating an array
    private int data[];

    private static int DEFAULT_SIZE = 10;

    //also working as an index value
    private int size = 0;

    //Default Instructor
    customArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    //To add element in the list
    public void add(int num){

        if(isFull()){
            resize();
        }

        //size++ means at current size it will insert that element and after that it will increase the size
        data[size++] = num;
    }

    //To check wether the array is full or not
    public boolean isFull(){
        return size == data.length;
    }

    //If array is full then Add more space in the array
    public void resize(){
        //Creating an temporary array of double the size of normal array
        int temp[] = new int[data.length * 2];

        //Copying the original array to default
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        } 

        //Now the refference variable named data will be pointing out to the temp array
        data = temp;

    }

    //Get a particular element
    public int get(int index){
        return data[index];
    }

    //return the size of arraylist
    public int size(){
        return size;
    }

    //Set the value whatever you want
    public void set(int index, int value){
        data[index] = value;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    //Why this overriding annotation is not giving error because this toString() method is in Object Class so that's we are overriding it
    //to print the array
    
    public void print(){

        System.out.print("[ ");
        for(int i=0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.print("] ");
    }


}
