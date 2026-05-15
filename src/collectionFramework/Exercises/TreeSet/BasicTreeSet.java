package collectionFramework.Exercises.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class BasicTreeSet {
    public static void main(String[] args) {
        /*
         * Logic:
         * A TreeSet is an implementation of the SortedSet interface backed by a TreeMap (Red-Black Tree).
         * It automatically sorts elements in their "natural order" (e.g., Numbers: 1, 2, 3... Strings: A, B, C...).
         * It does not allow duplicates.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set in C++ (Balanced Binary Search Tree):
         * Time Complexity:
         * - Insertion: O(log N) (finding the correct position in the tree).
         * - Traversal (Printing): O(N).
         * Space Complexity: O(N) to store the elements.
         * ---------------------------------------------------------
         */
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements in random order
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // Duplicate, will be ignored
        numbers.add(99);

        System.out.println("TreeSet (Automatically Sorted): " + numbers);

        // Iterating manually
        System.out.print("Iterating: ");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}