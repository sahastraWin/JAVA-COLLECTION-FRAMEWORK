package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(99);
        numbers.add(5);

        /*
         * Logic:
         * We use Collections.max() which iterates through the list once to find the largest value.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::max_element in C++:
         * Time Complexity: O(N) - Single pass traversal.
         * Space Complexity: O(1) - No extra space allocated.
         * ---------------------------------------------------------
         */
        if (!numbers.isEmpty()) {
            int maxVal = Collections.max(numbers);
            System.out.println("Maximum Element: " + maxVal);
        } else {
            System.out.println("List is empty.");
        }
    }
}