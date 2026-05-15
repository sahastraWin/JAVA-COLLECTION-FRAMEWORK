package collectionFramework.Exercises.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueViaPQ {
    public static void main(String[] args) {
        /*
         * Logic:
         * We can instantiate the `Queue` interface using `PriorityQueue`.
         * IMPORTANT: Unlike LinkedList or ArrayDeque, this does NOT strictly follow FIFO.
         * Instead, it orders elements based on their natural ordering (Priority).
         * Smallest integers will be "processed" (polled) first.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue:
         * Time Complexity:
         * - Enqueue (push): O(log N) - Slower than standard Queue's O(1).
         * - Dequeue (pop): O(log N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        Queue<Integer> pqQueue = new PriorityQueue<>();

        // Add elements in random order
        pqQueue.offer(300);
        pqQueue.offer(100);
        pqQueue.offer(200);

        System.out.println("Queue (PriorityQueue implementation): " + pqQueue);

        System.out.println("Poll (Smallest comes out): " + pqQueue.poll()); // 100
        System.out.println("Poll (Next smallest): " + pqQueue.poll());      // 200
    }
}