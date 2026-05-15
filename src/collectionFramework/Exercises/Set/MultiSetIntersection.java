package collectionFramework.Exercises.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiSetIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(5, 4, 8, 9));

        List<Set<Integer>> listOfSets = Arrays.asList(set1, set2, set3);

        /*
         * Logic:
         * We initialize the result with the first set.
         * Then we iteratively call retainAll() on the result with every other set.
         * retainAll keeps only elements present in both sets.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(N * K) where N is total elements and K is number of sets.
         * Space Complexity: O(S) where S is size of smallest set.
         * ---------------------------------------------------------
         */
        Set<Integer> result = new HashSet<>(listOfSets.get(0));

        for (int i = 1; i < listOfSets.size(); i++) {
            result.retainAll(listOfSets.get(i));
        }

        System.out.println("Intersection of all sets: " + result);
    }
}