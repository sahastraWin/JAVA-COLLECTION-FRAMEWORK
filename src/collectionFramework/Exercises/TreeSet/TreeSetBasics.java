package collectionFramework.Exercises.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetBasics {
    public static void main(String[] args) {
        // 1. Create and Print TreeSet
        /*
         * Logic:
         * TreeSet implements SortedSet. It stores elements in natural sorted order.
         * We use .add() to insert elements.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set::insert():
         * Time Complexity: O(log N) per insertion (Red-Black tree rebalancing).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("1. TreeSet: " + colors);

        // 2. Iterate TreeSet Elements
        /*
         * Logic:
         * Iterating a TreeSet guarantees the order (Ascending).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating std::set from begin() to end():
         * Time Complexity: O(N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.print("2. Iterating: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // 3. Add Elements to Another TreeSet
        /*
         * Logic:
         * .addAll() adds all elements from the specified collection.
         * The result is a union of both sets, sorted automatically.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set::insert(range_begin, range_end):
         * Time Complexity: O(M log(N + M)) where M is new elements.
         * ---------------------------------------------------------
         */
        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.add("Yellow");
        moreColors.addAll(colors);
        System.out.println("3. After addAll: " + moreColors);

        // 6. Clone TreeSet
        /*
         * Logic:
         * .clone() creates a shallow copy.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copy constructor set<T> s2(s1):
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeSet<String> clonedSet = (TreeSet<String>) colors.clone();
        System.out.println("6. Cloned Set: " + clonedSet);

        // 7. TreeSet Size
        /*
         * Logic:
         * .size() returns the number of elements.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("7. Size of Set: " + colors.size());
    }
}