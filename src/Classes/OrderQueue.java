package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OrderQueue {
    Queue orderQueue = new Queue();

    public OrderQueue(Queue orderQueue) {
        this.orderQueue = orderQueue;
    }

    public OrderQueue() {
    }

    public static Queue loadOrderQueue(LinkedList ordersList){
        Queue queue = new Queue();
        Node current = ordersList.getHead();
        while (current.next!=null){
            queue.enqueue(current.data);
            current = current.next;
        }
        if (current != null){
            queue.enqueue(current.data);
        }
        return queue;
    }
}
