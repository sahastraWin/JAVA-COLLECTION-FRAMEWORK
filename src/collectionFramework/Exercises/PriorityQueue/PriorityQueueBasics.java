package collectionFramework.Exercises.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        // 1. Create and Print PriorityQueue
        /*
         * Logic:
         * We initialize a PriorityQueue. By default, it orders elements in "natural order" (Alphabetical for Strings).
         * We use .add() or .offer() to insert.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue:
         * Time Complexity: O(log N) for insertion (push).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("1. PriorityQueue: " + colors);

        // 4. Insert Element into PriorityQueue
        /*
         * Logic:
         * .offer() is safer than .add() for capacity-restricted queues, though for PQ they are functionally similar.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue::push():
         * Time Complexity: O(log N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        colors.offer("Cyan");
        System.out.println("4. After Insertion: " + colors);

        // 2. Iterate PriorityQueue Elements
        /*
         * Logic:
         * WARNING: Iterating a PriorityQueue via iterator/for-each does NOT guarantee sorted order.
         * It only guarantees that the first element is the head (smallest).
         * To get sorted order, you must poll() elements out.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Standard C++ priority_queue does not support iteration.
         * One would use std::make_heap on a vector for iterable heap.
         * Time Complexity: O(N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.print("2. Iterating: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // 6. Count PriorityQueue Elements
        /*
         * Logic:
         * .size() returns the number of elements.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("6. Number of elements: " + colors.size());

        // 11. Convert PriorityQueue to String
        /*
         * Logic:
         * The standard .toString() method (inherited from AbstractCollection) provides the string representation.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Manual string building:
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        String pqString = colors.toString();
        System.out.println("11. String representation: " + pqString);
    }
}