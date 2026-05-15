package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListOps {
    public static void main(String[] args) {
        /*
         * Logic:
         * Java LinkedList is a doubly-linked list implementation.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list:
         * Add (End): O(1)
         * Remove (Specific Value): O(N) as we must search for it first.
         * Iterate: O(N)
         * Space Complexity: O(N) for storing nodes.
         * ---------------------------------------------------------
         */
        LinkedList<String> list = new LinkedList<>();

        // Add
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After Addition: " + list);

        // Remove
        list.remove("Python"); // Removes by object
        System.out.println("After Removal: " + list);

        // Iterate
        System.out.print("Iterating: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}