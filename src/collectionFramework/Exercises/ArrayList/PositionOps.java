package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;

public class PositionOps {
    public static void main(String[] args) {
        ArrayList<String> currency = new ArrayList<>();
        currency.add("USD");
        currency.add("INR");
        currency.add("EUR");
        currency.add("JPY");

        /* * Logic (Replace Second Element):
         * Standard set operation at index 1.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(1)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 21. Replace Second Element
        if (currency.size() >= 2) {
            currency.set(1, "GBP");
            System.out.println("21. List after replacing 2nd element: " + currency);
        }

        /* * Logic (Print by Position):
         * Iterating using a standard for loop with index.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * ---------------------------------------------------------
         */
        // 22. Print Elements by Position
        System.out.println("22. Printing by Index:");
        for (int i = 0; i < currency.size(); i++) {
            System.out.println("Index " + i + ": " + currency.get(i));
        }
    }
}