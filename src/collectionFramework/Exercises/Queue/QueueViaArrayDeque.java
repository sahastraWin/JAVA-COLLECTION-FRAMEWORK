package collectionFramework.Exercises.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueViaArrayDeque {
    public static void main(String[] args) {
        /*
         * Logic:
         * `ArrayDeque` (Array Double Ended Queue) is the most efficient implementation
         * for a standard Queue in Java. It uses a resizable array.
         * It is faster than LinkedList because it has better cache locality
         * and no overhead for node object allocation.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::deque (Double-ended queue):
         * Time Complexity:
         * - Enqueue/Dequeue: O(1) amortized.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        Queue<String> taskQueue = new ArrayDeque<>();

        taskQueue.offer("Task A");
        taskQueue.offer("Task B");
        taskQueue.offer("Task C");

        System.out.println("Processing ArrayDeque Queue:");
        while (!taskQueue.isEmpty()) {
            System.out.println("Completed: " + taskQueue.poll());
        }
    }
}