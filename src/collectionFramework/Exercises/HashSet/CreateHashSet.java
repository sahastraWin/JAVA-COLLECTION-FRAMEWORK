package collectionFramework.Exercises.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {
    public static void main(String[] args) {
        /*
         * Logic:
         * We initialize a HashSet and use the .add() method.
         * HashSet does not guarantee the order of elements (unlike ArrayList).
         * It allows null values but no duplicates.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_set in C++:
         * Time Complexity: O(1) on average for insertion.
         * Space Complexity: O(N) where N is the number of elements.
         * ---------------------------------------------------------
         */
        Set<String> codingLanguages = new HashSet<>();

        // Adding elements
        codingLanguages.add("Java");
        codingLanguages.add("Python");
        codingLanguages.add("C++");
        codingLanguages.add("JavaScript");

        // Adding a duplicate (will be ignored)
        codingLanguages.add("Java");

        System.out.println("HashSet Elements: " + codingLanguages);
    }
}