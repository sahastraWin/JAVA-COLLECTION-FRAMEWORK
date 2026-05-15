package collectionFramework.Exercises.HashMap;

import java.util.HashMap;

public class HashMapChecks {
    public static void main(String[] args) {
        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("India", "New Delhi");

        // 5. Check If Map is Empty
        /* * Logic:
         * .isEmpty() returns true if the map contains no key-value mappings.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map::empty():
         * Time Complexity: O(1).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        boolean isEmpty = capitalMap.isEmpty();
        System.out.println("5. Is map empty? " + isEmpty);

        // 6. Get Shallow Copy of HashMap
        /* * Logic:
         * .clone() creates a shallow copy. Keys/Values themselves are not cloned if they are mutable objects.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to copy constructor: std::unordered_map m2(m1):
         * Time Complexity: O(N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        HashMap<String, String> clonedMap = (HashMap<String, String>) capitalMap.clone();
        System.out.println("6. Cloned Map: " + clonedMap);

        // 7. Check If Key Exists in Map
        /* * Logic:
         * .containsKey(key) checks if a key is present.
         * This is very fast (O(1)) in HashMap due to hashing.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map::count() or find() != end():
         * Time Complexity: O(1) Average.
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        String searchKey = "USA";
        if (capitalMap.containsKey(searchKey)) {
            System.out.println("7. Key '" + searchKey + "' exists.");
        }

        // 8. Check If Value Exists in Map
        /* * Logic:
         * .containsValue(value) checks if a value exists.
         * IMPORTANT: This is slower than containsKey because HashMaps are not optimized for value lookup.
         * It must iterate over the values linearly.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * No direct equivalent. Must use std::find_if on the map:
         * Time Complexity: O(N) - Linear search.
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        String searchValue = "London";
        if (capitalMap.containsValue(searchValue)) {
            System.out.println("8. Value '" + searchValue + "' exists.");
        }
    }
}