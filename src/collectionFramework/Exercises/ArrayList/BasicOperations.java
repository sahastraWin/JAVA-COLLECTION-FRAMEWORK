package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicOperations {
    public static void main(String[] args) {
        // 1. Create and Print ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("1. Collection: " + colors);

        /* * Logic (Iterate):
         * We can use a standard for-loop, enhanced for-loop, or Iterator.
         * The enhanced for-loop is syntactic sugar for the Iterator.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating std::vector:
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 2. Iterate ArrayList Elements
        System.out.print("2. Iterating: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        /* * Logic (Insert at First):
         * arrayList.add(index, element) shifts all subsequent elements to the right.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::vector::insert(begin(), val):
         * Time Complexity: O(N) (due to shifting elements).
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 3. Insert at First Position
        colors.add(0, "Yellow");
        System.out.println("3. After Insertion at index 0: " + colors);

        /* * Logic (Retrieve):
         * arrayList.get(index) provides direct access.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to vector[i] or vector.at(i):
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 4. Retrieve Element by Index
        String element = colors.get(2);
        System.out.println("4. Element at index 2: " + element);

        /* * Logic (Update):
         * arrayList.set(index, element) replaces the element at the specified position.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to vector[i] = val:
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 5. Update ArrayList Element
        colors.set(1, "Purple"); // Replaces "Red" (since "Yellow" is at 0 now)
        System.out.println("5. After Update: " + colors);
    }
}