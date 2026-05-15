package collectionFramework.Exercises.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountryCapitals {
    public static void main(String[] args) {
        /*
         * Logic:
         * A HashMap stores data in Key-Value pairs.
         * Here, Key = Country (String), Value = Capital (String).
         * HashMap allows null values and one null key.
         * It does not guarantee order (unlike TreeMap).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map<std::string, std::string>:
         * Time Complexity:
         * - Insertion/Access: O(1) on average (due to hashing).
         * - Worst Case: O(N) (if many hash collisions occur).
         * Space Complexity: O(N) to store the pairs.
         * ---------------------------------------------------------
         */
        Map<String, String> capitals = new HashMap<>();

        // Adding key-value pairs
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("India", "New Delhi");

        // Retrieving a value using its key
        System.out.println("Capital of Japan: " + capitals.get("Japan"));

        // Iterating over the map
        System.out.println("\nAll Country-Capital Pairs:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}