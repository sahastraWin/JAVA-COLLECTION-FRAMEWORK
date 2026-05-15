package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListPart3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One"); list.add("Two"); list.add("Three"); list.add("Four"); list.add("Five");

        // 12. Remove specified element
        /*
         * Logic:
         * .remove(Object) removes the first occurrence.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::remove(val):
         * Time Complexity: O(N) (Linear search).
         * ---------------------------------------------------------
         */
        list.remove("Three");
        System.out.println("12. Removed 'Three': " + list);

        // 13. Remove First and Last elements
        /*
         * Logic:
         * .removeFirst() and .removeLast() are O(1).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to pop_front() and pop_back():
         * Time Complexity: O(1).
         * ---------------------------------------------------------
         */
        list.removeFirst();
        list.removeLast();
        System.out.println("13. Removed First/Last: " + list);

        // 15. Swap two elements
        /*
         * Logic:
         * Collections.swap(list, i, j).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iter_swap. In std::list, requires finding iterators O(N).
         * ---------------------------------------------------------
         */
        list.add("NewEnd");
        Collections.swap(list, 0, 1);
        System.out.println("15. Swapped index 0 and 1: " + list);

        // 16. Shuffle elements
        /*
         * Logic:
         * Collections.shuffle().
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Cannot shuffle std::list directly efficiently (no random access).
         * Must copy to vector, shuffle, copy back: O(N).
         * ---------------------------------------------------------
         */
        Collections.shuffle(list);
        System.out.println("16. Shuffled: " + list);

        // 14. Remove all elements
        /*
         * Logic:
         * .clear().
         * ---------------------------------------------------------
         * TC (C++): O(N).
         * ---------------------------------------------------------
         */
        list.clear();
        System.out.println("14. List cleared: " + list);
    }
}