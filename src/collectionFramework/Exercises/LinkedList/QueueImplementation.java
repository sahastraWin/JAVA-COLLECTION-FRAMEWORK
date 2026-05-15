package collectionFramework.Exercises.LinkedList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        /*
         * Logic:
         * The LinkedList class implements the Queue interface.
         * A Queue follows FIFO (First-In-First-Out).
         * We use offer() to add to the tail and poll() to remove from the head.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list or std::deque (which std::queue uses by default):
         * Time Complexity:
         * - Enqueue (push_back): O(1)
         * - Dequeue (pop_front): O(1)
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (Add to rear)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue State: " + queue);

        // Dequeue (Remove from front)
        System.out.println("Removed: " + queue.poll()); // Removes 10
        System.out.println("Head of Queue: " + queue.peek()); // Views 20

        System.out.println("Final Queue: " + queue);
    }
}