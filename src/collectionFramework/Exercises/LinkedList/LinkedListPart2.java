package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListPart2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.add("C");

        // 6. Insert at First and Last positions
        // 7. Insert at Front (Same as First)
        // 8. Insert at End (Same as Last)
        /*
         * Logic:
         * .addFirst() / .addLast() are optimized O(1) operations in a Doubly Linked List.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::push_front() and push_back():
         * Time Complexity: O(1).
         * ---------------------------------------------------------
         */
        list.addFirst("A"); // Front
        list.addLast("E");  // End
        System.out.println("6-8. After First/Last insertions: " + list);

        // 9. Insert some elements at specified position
        /*
         * Logic:
         * .addAll(index, Collection) inserts a collection starting at the index.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::insert(it, range_begin, range_end):
         * Time Complexity: O(K + M) (Reach index K + Insert M elements).
         * ---------------------------------------------------------
         */
        list.addAll(3, Arrays.asList("D1", "D2"));
        System.out.println("9. After bulk insertion at index 3: " + list);

        // 10. Get First and Last Occurrence
        /*
         * Logic:
         * .indexOf() finds first index.
         * .lastIndexOf() finds last index.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * No direct method. Must iterate manually (std::find / std::find_end).
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        list.add("A"); // Duplicate 'A' for demonstration
        System.out.println("10. First occurrence of 'A': " + list.indexOf("A"));
        System.out.println("    Last occurrence of 'A': " + list.lastIndexOf("A"));

        // 11. Display elements and their positions
        /*
         * Logic:
         * Simple loop with index tracking.
         * ---------------------------------------------------------
         * TC (C++): O(N).
         * ---------------------------------------------------------
         */
        System.out.println("11. Elements and positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("    Index " + i + ": " + list.get(i));
            // Note: .get(i) is O(i) in LinkedList. Loop is O(N^2).
            // Use Iterator for O(N) efficiency in real apps.
        }
    }
}