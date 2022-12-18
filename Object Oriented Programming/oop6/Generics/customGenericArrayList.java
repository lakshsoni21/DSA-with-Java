package oop6.Generics;

public class customGenericArrayList<T> {
    //Creating an array
    private Object data[];
    private static int DEFAULT_SIZE = 10;
    //also working as an index value
    private int size = 0;

    customGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){

        if(isFull()){
            resize();
        }

        //size++ means at current size it will insert that element and after that it will increase the size
        data[size++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        //Creating an temporary array of double the size of normal array
        Object temp[] = new Object[data.length * 2];

        //Copying the original array to default
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        } 

        //Now the refference variable named data will be pointing out to the temp array
        data = temp;

    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public T remove(){
        T removed = (T)(data[--size]);
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
