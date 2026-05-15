package collectionFramework.Exercises.HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        // 1. Associate Key with Value in HashMap
        /* * Logic:
         * We use .put(K, V) to insert or update mappings.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map::insert or operator[]:
         * Time Complexity: O(1) Average (Amortized constant).
         * Space Complexity: O(N) to store elements.
         * ---------------------------------------------------------
         */
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Blue");
        System.out.println("1. Initial Map: " + map1);

        // 2. Count Key-Value Mappings in Map
        /* * Logic:
         * .size() returns the number of key-value pairs.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map::size():
         * Time Complexity: O(1) - The size is tracked, not calculated.
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("2. Size of Map: " + map1.size());

        // 3. Copy Mappings to Another Map
        /* * Logic:
         * .putAll(Map m) copies all mappings from the specified map to this map.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to map2.insert(map1.begin(), map1.end()):
         * Time Complexity: O(N) - Linear relative to the size of the source map.
         * Space Complexity: O(N) - Space for the new elements.
         * ---------------------------------------------------------
         */
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White"); // Existing element
        map2.putAll(map1);
        System.out.println("3. Map2 after copying from Map1: " + map2);

        // 4. Remove All Mappings from Map
        /* * Logic:
         * .clear() removes all mappings. The map becomes empty.
         * * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map::clear():
         * Time Complexity: O(N) - Linear (destructors must be called for each element).
         * Space Complexity: O(1) - Technically the capacity might remain, but size is 0.
         * ---------------------------------------------------------
         */
        map2.clear();
        System.out.println("4. Map2 after clear(): " + map2);
    }
}