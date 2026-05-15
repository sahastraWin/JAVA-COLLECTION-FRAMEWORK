package collectionFramework.Exercises.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Comparator;

class FIFOElement {
    String value;
    int arrivalOrder;

    public FIFOElement(String value, int arrivalOrder) {
        this.value = value;
        this.arrivalOrder = arrivalOrder;
    }
}

public class QueueViaPQ {
    public static void main(String[] args) {
        /*
         * Logic:
         * A standard Queue is FIFO (First-In-First-Out).
         * A PriorityQueue sorts by priority.
         * To mimic a Queue, we assign a priority based on "arrival time".
         * Smaller arrival time = Higher priority (comes out first).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Doing this in C++ is inefficient compared to std::queue (deque),
         * but theoretically:
         * Time Complexity: O(log N) for push/pop (vs O(1) in standard Queue).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */

        // Comparator sorts by arrivalOrder Ascending
        PriorityQueue<FIFOElement> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.arrivalOrder));

        int counter = 0;

        // Enqueue
        queue.add(new FIFOElement("First", counter++));
        queue.add(new FIFOElement("Second", counter++));
        queue.add(new FIFOElement("Third", counter++));

        System.out.println("FIFO Order (Queue behavior):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().value);
        }
    }
}