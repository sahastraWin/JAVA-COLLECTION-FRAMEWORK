package collectionFramework.Exercises.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Comparator;

class LIFOElement {
    String value;
    int arrivalOrder;

    public LIFOElement(String value, int arrivalOrder) {
        this.value = value;
        this.arrivalOrder = arrivalOrder;
    }
}

public class StackViaPQ {
    public static void main(String[] args) {
        /*
         * Logic:
         * A Stack is LIFO (Last-In-First-Out).
         * To mimic this with a PriorityQueue, the "Latest" arrival must have the highest priority.
         * We sort by arrival time DESCENDING.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Inefficient compared to std::stack (vector/deque), but theoretically:
         * Time Complexity: O(log N) for push/pop (vs O(1) in standard Stack).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */

        // Comparator sorts by arrivalOrder Descending
        PriorityQueue<LIFOElement> stack = new PriorityQueue<>((e1, e2) -> Integer.compare(e2.arrivalOrder, e1.arrivalOrder));

        int counter = 0;

        // Push
        stack.add(new LIFOElement("Bottom", counter++));
        stack.add(new LIFOElement("Middle", counter++));
        stack.add(new LIFOElement("Top", counter++));

        System.out.println("LIFO Order (Stack behavior):");
        while (!stack.isEmpty()) {
            System.out.println(stack.poll().value);
        }
    }
}