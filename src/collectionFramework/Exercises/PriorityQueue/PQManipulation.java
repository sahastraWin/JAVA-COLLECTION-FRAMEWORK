package collectionFramework.Exercises.PriorityQueue;

import java.util.PriorityQueue;

public class PQManipulation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(5);

        // 3. Add All Elements to Another PriorityQueue
        /*
         * Logic:
         * .addAll(Collection) efficiently adds all elements from one collection to another.
         * The heap property is maintained after the operation.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating and pushing, or inserting a range:
         * Time Complexity: O(M log(N+M)) where M is size of new elements.
         * Space Complexity: O(1) (excluding storage for new elements).
         * ---------------------------------------------------------
         */
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(100);
        pq2.addAll(pq1);
        System.out.println("3. New PQ after addAll: " + pq2);

        // 8. Peek First PriorityQueue Element
        /*
         * Logic:
         * .peek() retrieves the head (smallest element) WITHOUT removing it.
         * Returns null if empty.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue::top():
         * Time Complexity: O(1).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("8. Head (Peek): " + pq2.peek());

        // 9. Poll First PriorityQueue Element
        /*
         * Logic:
         * .poll() retrieves AND removes the head.
         * This triggers a "heapify" operation to restructure the tree.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue::pop() (void return) + top():
         * Time Complexity: O(log N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("9. Removed Head (Poll): " + pq2.poll());
        System.out.println("   New Head: " + pq2.peek());

        // 5. Clear PriorityQueue
        /*
         * Logic:
         * .clear() removes all elements.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to assigning an empty object or popping until empty:
         * Time Complexity: O(N) (Destructors) or O(1) for trivial types.
         * ---------------------------------------------------------
         */
        pq1.clear();
        System.out.println("5. PQ1 after clear: " + pq1);
    }
}