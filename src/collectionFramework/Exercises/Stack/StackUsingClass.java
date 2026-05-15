package collectionFramework.Exercises.Stack;
import java.util.Stack;

public class StackUsingClass {
    public static void main(String[] args) {
        /*
         * Logic:
         * Java provides a legacy `Stack` class (extends Vector).
         * It is synchronized (thread-safe), which makes it slightly slower than ArrayDeque.
         * Standard operations: push(), pop(), peek().
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::stack (usually implemented over std::deque):
         * Time Complexity:
         * - Push: O(1) amortized
         * - Pop: O(1)
         * - Top: O(1)
         * Space Complexity: O(N)
         * ---------------------------------------------------------
         */
        Stack<String> bookStack = new Stack<>();

        // Push elements onto the stack
        bookStack.push("Effective Java");
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");

        System.out.println("Current Stack: " + bookStack);

        // Peek (View top element)
        System.out.println("Top Book: " + bookStack.peek());

        // Pop (Remove top element)
        System.out.println("Popped: " + bookStack.pop());

        System.out.println("Stack after pop: " + bookStack);
    }
}