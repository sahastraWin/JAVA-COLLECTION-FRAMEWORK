package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        // Initialize ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Mango");

        /*
         * Logic:
         * We use the standard library sort which typically implements Timsort (a hybrid of Merge Sort and Insertion Sort).
         * This is highly optimized for real-world data.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * If implemented in C++ using std::sort (IntroSort):
         * Time Complexity: O(N log N) in average and worst cases.
         * Space Complexity: O(log N) stack space for recursion.
         * ---------------------------------------------------------
         */
        Collections.sort(fruits);

        System.out.println("Sorted List: " + fruits);
    }
}