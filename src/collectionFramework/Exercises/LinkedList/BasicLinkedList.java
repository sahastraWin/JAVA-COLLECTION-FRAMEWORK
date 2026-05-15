package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class BasicLinkedList {
    public static void main(String[] args) {
        /*
         * Logic:
         * Java's LinkedList is a Doubly Linked List implementation.
         * It allows for efficient insertion and removal at both ends (O(1)).
         * However, random access (get(i)) is slow (O(N)).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list in C++:
         * Time Complexity:
         * - Add (End/Front): O(1)
         * - Remove (Specific element): O(N) (Need to find it first)
         * - Iterate: O(N)
         * Space Complexity: O(N) (Nodes + Pointers).
         * ---------------------------------------------------------
         */
        LinkedList<String> programmingLangs = new LinkedList<>();

        // Add elements
        programmingLangs.add("Java");
        programmingLangs.add("Python");
        programmingLangs.add("C++");
        programmingLangs.addFirst("JavaScript"); // Adds to the front

        System.out.println("Initial List: " + programmingLangs);

        // Remove elements
        programmingLangs.remove("Python"); // Removes specific object
        programmingLangs.removeLast();     // Removes the last element

        System.out.println("After Removal: " + programmingLangs);

        // Iterate
        System.out.print("Iterating: ");
        Iterator<String> it = programmingLangs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}