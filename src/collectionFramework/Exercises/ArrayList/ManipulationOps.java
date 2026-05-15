package collectionFramework.Exercises.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationOps {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C"); list.add("D"); list.add("E");

        /* * Logic (Remove):
         * removing at index 2 shifts elements from index 3 onwards to the left.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::vector::erase:
         * Time Complexity: O(N) (due to shifting).
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 6. Remove Third Element (Index 2)
        list.remove(2);
        System.out.println("6. After Removing 3rd element: " + list);

        /* * Logic (Search):
         * .contains() or .indexOf() performs a linear scan using .equals().
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::find:
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 7. Search Element
        boolean found = list.contains("D");
        System.out.println("7. Is 'D' in list? " + found);

        /* * Logic (Sort):
         * Uses Timsort (Merge Sort + Insertion Sort).
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::sort (Introsort):
         * Time Complexity: O(N log N)
         * Space Complexity: O(log N) stack space.
         * ---------------------------------------------------------
         */
        // 8. Sort ArrayList
        Collections.sort(list);
        System.out.println("8. Sorted: " + list);

        /* * Logic (Copy):
         * Using the constructor is the idiomatic way to create a shallow copy.
         * Collections.copy(dest, src) requires dest to be pre-sized, which is cumbersome.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copy constructor vector<T> v2(v1):
         * Time Complexity: O(N)
         * Space Complexity: O(N)
         * ---------------------------------------------------------
         */
        // 9. Copy ArrayList
        ArrayList<String> copyList = new ArrayList<>(list);
        System.out.println("9. Copied List: " + copyList);

        /* * Logic (Shuffle):
         * Uses Fisher-Yates algorithm.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::shuffle:
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 10. Shuffle ArrayList
        Collections.shuffle(list);
        System.out.println("10. Shuffled: " + list);
    }
}