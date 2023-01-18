package Stacks;

public class dynamicStack extends customStack{
    
    public dynamicStack(){
        super();
    }

    public dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int num){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for(int i=0; i < data.length; i++){
                temp[i] = data[i];
            }
            // We do data = temp means now data reference variable will be pointing out to the temp reference variable array
            // Because after exiting the if condition the garabage collector will remove the temp reference variable
            // That's why we point our data reference variable
            data = temp;
        }

        //insert item

        return super.push(num);

    }

}
