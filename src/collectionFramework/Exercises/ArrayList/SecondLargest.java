package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(4); list.add(45); list.add(99);

        /*
         * Logic (Optimized):
         * Sorting would be O(N log N). We can do this in O(N) with a single pass.
         * We maintain two variables: highest and secondHighest.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(N) - Single pass.
         * Space Complexity: O(1) - Only two variables used.
         * ---------------------------------------------------------
         */
        if (list.size() < 2) {
            System.out.println("List needs at least two elements.");
            return;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        System.out.println("Second Largest: " + secondHighest);
    }
}