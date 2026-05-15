package collectionFramework.Exercises.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class PQAdvanced {
    public static void main(String[] args) {
        // Setup for Comparison
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("A"); pq1.add("B"); pq1.add("C");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("C"); pq2.add("A"); pq2.add("B");

        // 7. Compare PriorityQueues
        /*
         * Logic:
         * PriorityQueue does NOT override equals() from Object to perform value equality.
         * To check if two PQs contain the same elements, we can:
         * 1. Check size equality.
         * 2. Use .containsAll() (Order independent).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(N^2) in worst case using containsAll (linear scan per element).
         * O(N log N) if we sort copies and compare.
         * ---------------------------------------------------------
         */
        boolean areEqual = pq1.size() == pq2.size() && pq1.containsAll(pq2) && pq2.containsAll(pq1);
        System.out.println("7. Are PriorityQueues equal? " + areEqual);

        // 10. Convert PriorityQueue to Array
        /*
         * Logic:
         * .toArray() returns an Object array containing all elements.
         * Note: The array order is NOT guaranteed to be sorted (it reflects the heap array structure).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copying internal container (vector):
         * Time Complexity: O(N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        Object[] array = pq1.toArray();
        System.out.println("10. Converted to Array: " + Arrays.toString(array));

        // 12. Convert to Max PriorityQueue
        /*
         * Logic:
         * Java PQ is a Min-Heap by default.
         * To make a Max-Heap, we provide `Collections.reverseOrder()` to the constructor.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * std::priority_queue in C++ is a Max-Heap by default.
         * To get Min-Heap in C++, you use `greater<T>`.
         * Time Complexity: O(log N) per insertion.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.add(10);
        maxPQ.add(30);
        maxPQ.add(20);

        System.out.print("12. Max PriorityQueue Output: ");
        while(!maxPQ.isEmpty()) {
            // Polling will return elements High -> Low
            System.out.print(maxPQ.poll() + " ");
        }
        System.out.println();
    }
}