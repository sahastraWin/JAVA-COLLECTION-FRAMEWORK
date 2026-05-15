package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListPart1 {
    public static void main(String[] args) {
        // 1. Append element to end
        /*
         * Logic:
         * .add() appends to the end of the list.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::push_back():
         * Time Complexity: O(1).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        System.out.println("1. Initial List: " + list);

        // 2. Iterate through all elements
        /*
         * Logic:
         * Standard enhanced for-loop uses the iterator internally.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating std::list from begin() to end():
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        System.out.print("2. Iterating: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 3. Iterate starting at specified position
        /*
         * Logic:
         * .listIterator(index) returns an iterator starting at the specific index.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::advance(it, index):
         * Time Complexity: O(K) where K is the index (Sequential access).
         * ---------------------------------------------------------
         */
        System.out.print("3. Iterating from index 1: ");
        Iterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 4. Iterate in reverse order
        /*
         * Logic:
         * .descendingIterator() returns an iterator that traverses backwards.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::rbegin() to rend():
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        System.out.print("4. Reverse Iteration: ");
        Iterator<String> revIt = list.descendingIterator();
        while (revIt.hasNext()) {
            System.out.print(revIt.next() + " ");
        }
        System.out.println();

        // 5. Insert element at specified position
        /*
         * Logic:
         * .add(index, element) inserts element and shifts successors.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::insert(it, val):
         * Time Complexity: O(K) to reach the position (Seek time).
         * ---------------------------------------------------------
         */
        list.add(1, "Yellow");
        System.out.println("5. After inserting 'Yellow' at index 1: " + list);
    }
}