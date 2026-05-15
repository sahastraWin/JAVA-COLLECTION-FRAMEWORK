package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        /*
         * Logic (Optimized):
         * A naive nested loop or straight `retainAll` (without set) would be O(N*M).
         * We optimize by adding the first list to a HashSet for O(1) lookups,
         * then iterate the second list checking against the set.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to using std::unordered_set for lookups:
         * Time Complexity: O(N + M) where N and M are lengths of lists.
         * Space Complexity: O(min(N, M)) to store the intersection/hashset.
         * ---------------------------------------------------------
         */
        HashSet<Integer> set = new HashSet<>(list1);
        ArrayList<Integer> intersection = new ArrayList<>();

        for (Integer num : list2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}