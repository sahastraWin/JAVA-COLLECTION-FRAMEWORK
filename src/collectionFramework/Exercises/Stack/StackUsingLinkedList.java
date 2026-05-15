package collectionFramework.Exercises.Stack;

import java.util.LinkedList;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        /*
         * Logic:
         * The `LinkedList` class implements the `Deque` (Double Ended Queue) interface.
         * We can use it as a stack by adding and removing elements from the *beginning* (Head) of the list.
         * Methods `push()` (adds to first) and `pop()` (removes from first) are built-in.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list (Doubly Linked List):
         * Time Complexity:
         * - Push/Pop: O(1) (Head insertion/deletion is constant time).
         * Space Complexity: O(N) (Every node requires extra memory for pointers).
         * ---------------------------------------------------------
         */
        LinkedList<Integer> stack = new LinkedList<>();

        // Push operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack (LinkedList): " + stack);

        // Pop operation
        int poppedValue = stack.pop();
        System.out.println("Popped: " + poppedValue); // Should be 30

        // Peek operation
        System.out.println("Top Element: " + stack.peek()); // Should be 20
    }
}