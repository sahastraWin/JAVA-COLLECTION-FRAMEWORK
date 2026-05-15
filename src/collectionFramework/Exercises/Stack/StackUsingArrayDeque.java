package collectionFramework.Exercises.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingArrayDeque {
    public static void main(String[] args) {
        /*
         * Logic:
         * `ArrayDeque` is the recommended implementation for Stacks in modern Java.
         * It is faster than the legacy `Stack` class because it is not synchronized.
         * It uses a resizable array internally (similar to std::vector logic but circular).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::deque (Double-ended queue) or std::vector:
         * Time Complexity:
         * - Push/Pop: O(1) amortized.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        Deque<String> stack = new ArrayDeque<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack (ArrayDeque): " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Popping: " + stack.pop());
        }
    }
}