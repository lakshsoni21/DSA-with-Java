package Queues;

public class Main {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5);
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);
        // queue.display();

        // System.out.println(queue.pop());

        // queue.display();

        CircularQueue circle = new CircularQueue(5);
        circle.insert(1);
        circle.insert(2);
        circle.insert(3);
        circle.insert(4);
        circle.insert(5);
        circle.display();

        circle.remove();
        circle.remove();
        circle.insert(9);
        circle.insert(10);

        circle.display();

        // Dynamic Queue
        DynamicQueue dQueue = new DynamicQueue(5);

        dQueue.insert(1);
        dQueue.insert(2);
        dQueue.insert(3);
        dQueue.insert(4);
        dQueue.insert(5);

        // Inserting the element if size is full
        dQueue.insert(6);

        dQueue.display();

    }
}
