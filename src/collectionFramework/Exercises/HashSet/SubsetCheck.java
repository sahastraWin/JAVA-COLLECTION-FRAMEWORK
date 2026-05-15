package collectionFramework.Exercises.HashSet;

import java.util.HashSet;
import java.util.Arrays;

public class SubsetCheck {
    public static void main(String[] args) {
        HashSet<Integer> mainSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> subSet = new HashSet<>(Arrays.asList(2, 4, 6));
        HashSet<Integer> notSubSet = new HashSet<>(Arrays.asList(2, 4, 9));

        /*
         * Logic:
         * We use the containsAll() method.
         * It returns true only if every element in the argument collection
         * exists in the parent collection.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating the smaller set and checking find() in the larger set:
         * Time Complexity: O(M) where M is the size of the subset
         * (assuming O(1) average lookup for Hash Sets).
         * Space Complexity: O(1) - No extra space required for checking.
         * ---------------------------------------------------------
         */
        System.out.println("Is subSet a subset of mainSet? " + mainSet.containsAll(subSet));
        System.out.println("Is notSubSet a subset of mainSet? " + mainSet.containsAll(notSubSet));
    }
}