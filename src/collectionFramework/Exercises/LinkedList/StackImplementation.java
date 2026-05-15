package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;

public class StackImplementation {
    public static void main(String[] args) {
        /*
         * Logic:
         * The LinkedList class also implements the Deque interface.
         * This allows it to function as a Stack (LIFO - Last-In-First-Out).
         * We use push() (adds to head) and pop() (removes from head).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list (using push_front/pop_front):
         * Time Complexity:
         * - Push: O(1)
         * - Pop: O(1)
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        LinkedList<String> stack = new LinkedList<>();

        // Push (Add to top)
        stack.push("Page 1");
        stack.push("Page 2");
        stack.push("Page 3");

        System.out.println("Stack State: " + stack);

        // Pop (Remove from top)
        System.out.println("Popped: " + stack.pop()); // Removes Page 3

        // Peek
        System.out.println("Top Element: " + stack.peek()); // Views Page 2
    }
}