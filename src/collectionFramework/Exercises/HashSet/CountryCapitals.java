package collectionFramework.Exercises.HashSet;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitals {
    public static void main(String[] args) {
        /*
         * Logic:
         * We use a HashMap<String, String> where Key = Country, Value = Capital.
         * Keys in a HashMap must be unique.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map in C++:
         * Time Complexity: O(1) for insertion and retrieval (average).
         * Space Complexity: O(N) to store N key-value pairs.
         * ---------------------------------------------------------
         */
        Map<String, String> capitalMap = new HashMap<>();

        // Storing mappings
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("France", "Paris");
        capitalMap.put("Japan", "Tokyo");

        // Retrieving a value
        System.out.println("Capital of Japan: " + capitalMap.get("Japan"));

        // Iterating through the map
        System.out.println("\nAll Mappings:");
        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}