package collectionFramework.queue;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        //part of the queue interface
        //orders element based on their natural ordering (for primitive lowest first).
        //custom comparator for customized ordering.
        //does not allow null elements.
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(1);
        pqueue.add(2);
        pqueue.add(3);
        pqueue.add(4);
        System.out.println(pqueue);//not sorted
        while (!pqueue.isEmpty()) {
            System.out.println(pqueue.poll());
        }
        //internal ordering:
        //by default priority queue is implemented as a min-heap by default(for natural ordering)
    }
}
