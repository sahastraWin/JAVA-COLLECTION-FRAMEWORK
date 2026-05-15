package collectionFramework.Exercises.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapViews {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John Doe");
        employees.put(102, "Jane Smith");
        employees.put(103, "Bob Johnson");

        // 9. Get Set View of Map Entries
        /* * Logic:
         * .entrySet() returns a Set of Map.Entry objects (Key-Value pairs).
         * This is the most efficient way to iterate over both keys and values.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating via begin() and end():
         * Time Complexity: O(1) to get the view, O(N) to iterate it.
         * Space Complexity: O(1) (It's a view, not a copy).
         * ---------------------------------------------------------
         */
        System.out.println("9. Entry Set:");
        Set<Map.Entry<Integer, String>> entries = employees.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("   ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 10. Get Value by Key from Map
        /* * Logic:
         * .get(key) returns the value to which the key is mapped, or null.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map::at() or operator[]:
         * Time Complexity: O(1) Average.
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        String val = employees.get(102);
        System.out.println("10. Value for key 102: " + val);

        // 11. Get Set of Keys from Map
        /* * Logic:
         * .keySet() returns a Set view of the keys contained in this map.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * C++ doesn't have a direct "Key View". You must iterate and extract keys.
         * Time Complexity: O(1) to get view in Java.
         * Space Complexity: O(1) view.
         * ---------------------------------------------------------
         */
        System.out.println("11. Key Set: " + employees.keySet());

        // 12. Get Collection of Values from Map
        /* * Logic:
         * .values() returns a Collection view of the values.
         * Note that this is a Collection, not a Set, because values can be duplicates.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * C++ doesn't have a direct "Value View". Must iterate and extract.
         * Time Complexity: O(1) to get view in Java.
         * Space Complexity: O(1) view.
         * ---------------------------------------------------------
         */
        Collection<String> values = employees.values();
        System.out.println("12. Collection of Values: " + values);
    }
}