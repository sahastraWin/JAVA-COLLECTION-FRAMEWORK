package collectionFramework.Exercises.PriorityQueue;

import java.util.PriorityQueue;

public class PQOperations {
    public static void main(String[] args) {
        /*
         * Logic:
         * We demonstrate standard queue operations: add, peek (view head), and poll (remove head).
         * This confirms the Min-Heap property where the smallest element is always at the head.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue:
         * Time Complexity:
         * - push(): O(log N)
         * - top(): O(1)
         * - pop(): O(log N)
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Banana");
        pq.add("Apple");
        pq.add("Cherry");

        // Peek looks at the head without removing it
        System.out.println("Head (Peek): " + pq.peek()); // Should be Apple

        System.out.println("Iterating (Order not guaranteed in iterator): " + pq);

        // Polling to empty
        System.out.println("Removing: " + pq.poll());
        System.out.println("New Head: " + pq.peek());
    }
}