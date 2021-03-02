package _9collection.ex_005_queque._1priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Use Queue if you need to store the data in particular order.
        // Queue usually use the FIFO - first in first out, principal.


        // PriorityQueue - this Queue
        // streamline order in natural order or using some custom Comparator.
        // Initial capacity is 2, and also create an anonymous inner class
        Queue<Integer> q = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            // Implementing the reverse sorting method using the compare method
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });


        // method add() in Queue will throw IllegalStateException - if Queue is full
        // method element() will return main element but without deletion.
        // method peek() will return main element but without deletion, if Queue is empty: return null
        // method poll() return main element and delete it from Queue, if Queue is empty: return null
        // method remove() return main element and delete if from Queue

        // methods element() and remove() diff from peek() and poll()
        // because they throw NoSuchElementException if Queue isempty


        // Insert an item into the queue if in possible
        q.offer(7); // change 7
        q.offer(9); // change 9
        System.out.println(q);
        q.offer(1); // change 10
        q.offer(6); // change 11
        System.out.println(q);
        // Using the poll method,
        // we return and remove the head element of the queue
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
