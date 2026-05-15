package collectionFramework.Exercises.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueViaLinkedList {
    public static void main(String[] args) {
        /*
         * Logic:
         * The `LinkedList` class implements the `Queue` interface.
         * It functions as a standard FIFO (First-In-First-Out) queue.
         * - offer(): Adds to the tail.
         * - poll(): Removes from the head.
         * - peek(): Inspects the head.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::queue using std::list as the underlying container:
         * Time Complexity:
         * - Enqueue/Dequeue: O(1) (Head/Tail pointer operations).
         * Space Complexity: O(N) (Nodes + Pointers).
         * ---------------------------------------------------------
         */
        Queue<String> supportTicketQueue = new LinkedList<>();

        // Add tickets
        supportTicketQueue.offer("Ticket #101: Login Issue");
        supportTicketQueue.offer("Ticket #102: Payment Error");
        supportTicketQueue.offer("Ticket #103: Feature Request");

        System.out.println("Current Queue: " + supportTicketQueue);

        // Process tickets (FIFO)
        System.out.println("Processing: " + supportTicketQueue.poll()); // Ticket #101
        System.out.println("Next in line: " + supportTicketQueue.peek()); // Ticket #102

        System.out.println("Remaining Queue: " + supportTicketQueue);
    }
}