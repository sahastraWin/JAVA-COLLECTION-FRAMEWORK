package collectionFramework.Exercises.PriorityQueue;

import java.util.PriorityQueue;

public class BasicPriorityQueue {
    public static void main(String[] args) {
        /*
         * Logic:
         * Java's PriorityQueue is implemented as a Min-Heap by default.
         * Elements are ordered according to their natural ordering.
         * To print them in sorted order, we cannot just print the queue object
         * (which shows the internal heap array structure). We must "poll" (remove) elements one by one.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue (Max-Heap by default) or std::multiset:
         * Time Complexity:
         * - Insertion (push): O(log N)
         * - Deletion (pop): O(log N)
         * - Printing all (Sort): O(N log N)
         * Space Complexity: O(N) to store elements.
         * ---------------------------------------------------------
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements (unordered input)
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println("Printing elements in sorted order (Min-Heap):");
        while (!pq.isEmpty()) {
            // poll() retrieves and removes the head (smallest element)
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}