package collectionFramework.Exercises.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    public static void main(String[] args) {
        // 1. Append Element to HashSet
        /*
         * Logic:
         * We use .add() to insert elements.
         * If the element already exists, it returns false and does not add it again.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_set::insert():
         * Time Complexity: O(1) Average.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("1. Initial Set: " + colors);

        // 2. Iterate HashSet Elements
        /*
         * Logic:
         * Since HashSet is unordered, iteration order is not guaranteed.
         * We can use an Iterator or an enhanced for-loop.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating via begin() to end():
         * Time Complexity: O(N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.print("2. Iterating: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // 3. Get HashSet Size
        /*
         * Logic:
         * .size() returns the number of elements.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_set::size():
         * Time Complexity: O(1).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("3. Size of Set: " + colors.size());

        // 5. Check if HashSet is Empty (Doing this before clear to show false)
        /*
         * Logic:
         * .isEmpty() checks if size == 0.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_set::empty():
         * Time Complexity: O(1).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("5. Is Set empty? " + colors.isEmpty());

        // 4. Clear HashSet
        /*
         * Logic:
         * .clear() removes all elements, resetting size to 0.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_set::clear():
         * Time Complexity: O(N) (Destructors must be called).
         * Space Complexity: O(1) (Capacity may remain, but logically empty).
         * ---------------------------------------------------------
         */
        colors.clear();
        System.out.println("4. Set after clear: " + colors);
        System.out.println("   Is Set empty now? " + colors.isEmpty());
    }
}