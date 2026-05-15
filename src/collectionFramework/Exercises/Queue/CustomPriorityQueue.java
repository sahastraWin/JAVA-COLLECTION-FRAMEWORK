package collectionFramework.Exercises.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class CustomPriorityQueue {
    public static void main(String[] args) {
        /*
         * Logic:
         * By default, PriorityQueue is a Min-Heap (smallest first).
         * To implement a Max-Heap (largest first), we pass a custom comparator.
         * `Collections.reverseOrder()` is a built-in comparator for this purpose.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue<int> (which is Max-Heap by default):
         * Time Complexity:
         * - Push/Pop: O(log N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(99);

        System.out.println("Max-Heap (Highest Priority First):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
}
