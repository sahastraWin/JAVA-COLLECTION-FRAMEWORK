package collectionFramework.Exercises.TreeSet;

import java.util.TreeSet;
import java.util.Arrays;

public class TreeSetModification {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>(Arrays.asList(10, 20, 30, 40));
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(10, 20, 30, 40));
        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(10, 20, 35));

        // 8. Compare TreeSets
        /*
         * Logic:
         * .equals() checks if two sets contain exactly the same elements.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set::operator==:
         * Time Complexity: O(N) (Linear scan comparison).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("8. Set1 equals Set2? " + set1.equals(set2));
        System.out.println("   Set1 equals Set3? " + set1.equals(set3));

        // 14. Poll First TreeSet Element
        /*
         * Logic:
         * .pollFirst() retrieves and REMOVES the lowest element.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to begin() then erase():
         * Time Complexity: O(log N) (Tree rebalancing).
         * ---------------------------------------------------------
         */
        System.out.println("14. Poll First: " + set1.pollFirst());
        System.out.println("    Set after pollFirst: " + set1);

        // 15. Poll Last TreeSet Element
        /*
         * Logic:
         * .pollLast() retrieves and REMOVES the highest element.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to rbegin() then erase():
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        System.out.println("15. Poll Last: " + set1.pollLast());
        System.out.println("    Set after pollLast: " + set1);

        // 16. Remove Element from TreeSet
        /*
         * Logic:
         * .remove(Object) removes a specific element.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set::erase(val):
         * Time Complexity: O(log N) (Search + Rebalance).
         * ---------------------------------------------------------
         */
        boolean removed = set1.remove(20);
        System.out.println("16. Removed 20? " + removed);
        System.out.println("    Final Set: " + set1);
    }
}