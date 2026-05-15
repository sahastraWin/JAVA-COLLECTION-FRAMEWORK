package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Alice"); list1.add("Bob");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Alice"); list2.add("Bob");

        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Alice");

        /*
         * Logic:
         * The equals() method in Java's AbstractList (which LinkedList inherits)
         * checks if both lists contain the same elements in the same order.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::equal comparing two ranges:
         * Time Complexity: O(N) - Must compare every element.
         * Space Complexity: O(1) - Iterative comparison.
         * ---------------------------------------------------------
         */
        boolean isEqual1 = list1.equals(list2);
        boolean isEqual2 = list1.equals(list3);

        System.out.println("List1 equals List2? " + isEqual1); // true
        System.out.println("List1 equals List3? " + isEqual2); // false
    }
}