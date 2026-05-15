package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) numbers.add(i);

        System.out.println("Original: " + numbers);

        /*
         * Logic:
         * Collections.shuffle() uses the Fisher-Yates shuffle algorithm.
         * It swaps elements randomly to ensure a uniform distribution.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::shuffle:
         * Time Complexity: O(N) - Linear pass through the list.
         * Space Complexity: O(1) - In-place shuffling.
         * ---------------------------------------------------------
         */
        Collections.shuffle(numbers);

        System.out.println("Shuffled: " + numbers);
    }
}