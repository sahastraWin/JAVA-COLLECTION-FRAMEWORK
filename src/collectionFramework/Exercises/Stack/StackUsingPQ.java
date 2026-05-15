package collectionFramework.Exercises.Stack;

import java.util.Comparator;
import java.util.PriorityQueue;

// Wrapper class to store value and insertion order
class StackElement {
    String value;
    int order;

    public StackElement(String value, int order) {
        this.value = value;
        this.order = order;
    }
}

public class StackUsingPQ {
    public static void main(String[] args) {
        /*
         * Logic:
         * A Stack follows LIFO (Last-In, First-Out).
         * A PriorityQueue pulls elements based on priority.
         * To mimic a Stack, we assign a priority based on "insertion time".
         * The element inserted *last* (highest counter) must have the *highest priority*.
         * We use a custom comparator to sort by `order` in descending order.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity:
         * - Push: O(log N) (Heap insertion).
         * - Pop: O(log N) (Heap deletion).
         * - (This is inefficient compared to a real Stack's O(1)).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */

        // Custom Comparator: Higher order = Higher priority (LIFO)
        Comparator<StackElement> lifoComparator = (e1, e2) -> Integer.compare(e2.order, e1.order);

        PriorityQueue<StackElement> pqStack = new PriorityQueue<>(lifoComparator);

        int counter = 0;

        // Push simulation
        pqStack.add(new StackElement("Bottom Plate", counter++));
        pqStack.add(new StackElement("Middle Plate", counter++));
        pqStack.add(new StackElement("Top Plate", counter++));

        System.out.println("Popping from PriorityQueue Stack:");

        while (!pqStack.isEmpty()) {
            System.out.println(pqStack.poll().value);
        }
    }
}