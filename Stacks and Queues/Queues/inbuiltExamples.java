package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class inbuiltExamples {
    public static void main(String[] args) {
        
        // Queue is a Interface it is not a class
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // PEEK - Will return the head of the list which is here 1
        System.out.println(queue.peek());

        // remove - will remove the first person in the line
        // FIFO - First inserted First Removed
        // LILO - Last inserted Last Removed
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        // Deque
        // The Deque has two sub classes which is LinkedList and ArrayDeque
        //Linked List you know
        // ArrayDeque has no limit size and You can insert or remove from the both ends that's what the main difference is between normal Array and ArrayDeque
        // Null elements not allowed in the ArrayDeque
        // ArrayDeque is faster than LinkedList and Stacks
        Deque<Integer> deck = new ArrayDeque<>();
        deck.add(5);
        deck.add(10);
        deck.add(15);
        deck.addFirst(1);
        deck.addLast(5);
        deck.removeFirst();
        deck.removeLast();

    }
}
