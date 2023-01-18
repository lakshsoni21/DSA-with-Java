package Stacks;

import java.util.Stack;

public class inbuiltExamples {
    public static void main(String[] args) {
        
        // Creating a object of Stack type of Integer
        Stack<Integer> stack = new Stack<>();

        // This push will add the item in the stack in stack wise

        // It is the First item that is inserted in the Stack
        // This will remove Last
        // FILO (First in Last out)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // The last item is addded in the Stack
        // LIFO (Last in first out) It will remove first 
        stack.push(5);

        // pop will remove the item stack wise  and it returns the value that you are removing
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // When you remove when the stack is empty
        // Then it will giver error EXception in thread EmptyStack
        // System.out.println(stack.pop());


    }
}
