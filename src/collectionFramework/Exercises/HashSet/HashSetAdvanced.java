package collectionFramework.Exercises.HashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Set;

public class HashSetAdvanced {
    public static void main(String[] args) {
        // Setup for Problem 9
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 2));

        // 9. Find Elements Less Than 7 in TreeSet
        /*
         * Logic:
         * TreeSet provides .headSet(element), which returns a view of the portion of this set
         * whose elements are strictly less than 'element'.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set::lower_bound or iterating from begin() to find(7):
         * Time Complexity: O(log N) to find the cutoff point.
         * Space Complexity: O(1) (View) or O(K) if copying results.
         * ---------------------------------------------------------
         */
        Set<Integer> lessThanSeven = numbers.headSet(7);
        System.out.println("9. Numbers less than 7: " + lessThanSeven);

        // Setup for Problems 10-12
        HashSet<String> set1 = new HashSet<>();
        set1.add("Java"); set1.add("Python"); set1.add("C++");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Python"); set2.add("C++"); set2.add("JavaScript");

        // 10. Compare Two HashSets
        /*
         * Logic:
         * .equals() checks if both sets have the same size and contain the same elements.
         * Order does not matter.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to operator== for std::unordered_set:
         * Time Complexity: O(N) (Requires scanning and hashing check for each element).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        boolean isEqual = set1.equals(set2);
        System.out.println("10. Are set1 and set2 equal? " + isEqual);

        // 11. Retain Common Elements in Sets (Intersection)
        /*
         * Logic:
         * .retainAll(Collection) modifies the set to keep only elements present in the argument collection.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * No direct single function, usually implemented by iterating and erasing:
         * Time Complexity: O(N) (Iterate set1, check existence in set2).
         * Space Complexity: O(1) (In-place modification).
         * ---------------------------------------------------------
         */
        HashSet<String> intersection = new HashSet<>(set1); // Copy to avoid destroying set1
        intersection.retainAll(set2);
        System.out.println("11. Common Elements: " + intersection);

        // 12. Remove All from HashSet
        /*
         * Logic:
         * While .clear() empties a set, .removeAll(Collection) removes specific elements.
         * If we pass the set to itself (set.removeAll(set)), it effectively clears it.
         * Here we demonstrate removing specific items.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating and calling erase():
         * Time Complexity: O(N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        set1.removeAll(set2); // Removes Python and C++ from set1
        System.out.println("12. set1 after removing elements present in set2: " + set1);
    }
}