package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        /*
         * Logic:
         * We convert the ArrayList to a LinkedHashSet.
         * A Set naturally prevents duplicates.
         * LinkedHashSet is used specifically to preserve the insertion order.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copying vector to std::unordered_set (or std::unique with sort):
         * Time Complexity: O(N) on average (insertion into Hash Set).
         * Space Complexity: O(N) to store the unique elements in the set.
         * ---------------------------------------------------------
         */
        Set<Integer> set = new LinkedHashSet<>(numbers);

        // Clear original list and add back unique elements
        numbers.clear();
        numbers.addAll(set);

        System.out.println("List after removing duplicates: " + numbers);
    }
}