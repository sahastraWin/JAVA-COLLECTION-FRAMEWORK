package collectionFramework.Exercises.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapPQ {
    public static void main(String[] args) {
        /*
         * Logic:
         * By default, PQ is a Min-Heap. To make it a Max-Heap (largest element first),
         * we pass `Collections.reverseOrder()` to the constructor.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue<int> (which is Max-Heap by default):
         * Time Complexity: O(log N) for insertions and deletions.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(10);
        maxPQ.add(50);
        maxPQ.add(20);
        maxPQ.add(5);

        System.out.println("Max-Heap Output:");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " ");
        }
        System.out.println();
    }
}