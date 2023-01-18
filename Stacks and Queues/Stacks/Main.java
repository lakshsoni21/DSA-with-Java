package Stacks;

public interface Main {
    public static void main(String[] args) throws Exception {
        
        customStack stack = new customStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        System.out.println(stack.pop());

        // The arraySize is not Limiteds
        dynamicStack dStack = new dynamicStack(5);
        dStack.push(1);
        dStack.push(2);
        dStack.push(3);
        dStack.push(4);
        dStack.push(5);
        dStack.push(6);
        dStack.display();




    }
}
