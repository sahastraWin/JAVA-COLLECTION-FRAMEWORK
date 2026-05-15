package collectionFramework.Exercises.HashSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;

public class HashSetConversions {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // 6. Clone HashSet
        /*
         * Logic:
         * .clone() creates a shallow copy of the set instance.
         * Note: The elements themselves are not cloned if they are mutable objects.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copy constructor or assignment operator:
         * Time Complexity: O(N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        @SuppressWarnings("unchecked")
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("6. Cloned Set: " + clonedSet);

        // 7. Convert HashSet to Array
        /*
         * Logic:
         * .toArray(new Type[0]) returns an array containing all elements.
         * Passing an empty array of the correct type tells Java to allocate a new array of the right size.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copying set elements to a raw array or std::vector:
         * Time Complexity: O(N).
         * Space Complexity: O(N) for the new array.
         * ---------------------------------------------------------
         */
        String[] array = set.toArray(new String[0]);
        System.out.println("7. Array elements: " + Arrays.toString(array));

        // 8. Convert HashSet to TreeSet
        /*
         * Logic:
         * We pass the HashSet to the TreeSet constructor.
         * This automatically sorts the elements (natural ordering).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copying unordered_set to std::set:
         * Time Complexity: O(N log N) (Inserting N elements into a BST).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("8. Converted to TreeSet (Sorted): " + treeSet);
    }
}