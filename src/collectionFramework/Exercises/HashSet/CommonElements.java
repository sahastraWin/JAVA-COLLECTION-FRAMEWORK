package collectionFramework.Exercises.HashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10); list1.add(20); list1.add(30); list1.add(40);

        List<Integer> list2 = new ArrayList<>();
        list2.add(30); list2.add(40); list2.add(50); list2.add(60);

        /*
         * Logic (Optimized):
         * A naive nested loop approach would be O(N*M).
         * Optimization: Insert all elements of List1 into a HashSet (O(N)).
         * Then iterate List2 and check if the element exists in the Set (O(1) per check).
         * This reduces complexity significantly.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(N + M) where N and M are sizes of the lists.
         * Space Complexity: O(min(N, M)) to store the intersection or the set.
         * ---------------------------------------------------------
         */
        Set<Integer> set = new HashSet<>(list1);
        List<Integer> common = new ArrayList<>();

        for (Integer num : list2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        System.out.println("Common Elements: " + common);
    }
}