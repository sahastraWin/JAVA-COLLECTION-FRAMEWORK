package collectionFramework.Exercises.TreeMap;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class TreeMapBasics {
    public static void main(String[] args) {
        // 1. Associate Value with Key in TreeMap
        /*
         * Logic:
         * We use .put(K, V) to insert data.
         * TreeMap automatically sorts data based on the natural ordering of keys.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::insert or operator[]:
         * Time Complexity: O(log N) - Insertion into a Red-Black Tree.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(10, "Red");
        map1.put(20, "Green");
        map1.put(40, "Blue");
        map1.put(30, "Yellow");
        System.out.println("1. Initial Map: " + map1);

        // 2. Copy TreeMap to Another TreeMap
        /*
         * Logic:
         * .putAll(Map) copies all mappings.
         * The destination TreeMap sorts the new entries automatically.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to map2.insert(map1.begin(), map1.end()):
         * Time Complexity: O(M log(N+M)) where M is the size of the source map.
         * Space Complexity: O(N + M).
         * ---------------------------------------------------------
         */
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(5, "White");
        map2.putAll(map1);
        System.out.println("2. Map2 after copying: " + map2);

        // 3. Search Key in TreeMap
        /*
         * Logic:
         * .containsKey(key) utilizes the binary search tree structure for fast lookup.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::find():
         * Time Complexity: O(log N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        if (map1.containsKey(20)) {
            System.out.println("3. Key 20 found.");
        }

        // 4. Search Value in TreeMap
        /*
         * Logic:
         * .containsValue(value) must iterate the entire tree as values are not sorted.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * No direct method; requires linear scan (std::find_if):
         * Time Complexity: O(N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        if (map1.containsValue("Green")) {
            System.out.println("4. Value 'Green' found.");
        }

        // 5. Get All Keys from TreeMap
        /*
         * Logic:
         * .keySet() returns a Set view of the keys.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Iterating a map implicitly gives access to keys:
         * Time Complexity: O(1) to get the view, O(N) to iterate.
         * Space Complexity: O(1) (View).
         * ---------------------------------------------------------
         */
        Set<Integer> keys = map1.keySet();
        System.out.println("5. All Keys: " + keys);

        // 6. Delete All Elements from TreeMap
        /*
         * Logic:
         * .clear() removes all mappings.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::clear():
         * Time Complexity: O(N) (Destruction of nodes).
         * ---------------------------------------------------------
         */
        map1.clear();
        System.out.println("6. Map1 after clear: " + map1);
    }
}