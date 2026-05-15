package collectionFramework.Exercises.TreeMap;

import java.util.TreeMap;
import java.util.NavigableSet;
import java.util.NavigableMap;

public class TreeMapRangeViews {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 10; i <= 60; i += 10) {
            map.put(i, "Val" + i);
        }
        // Map: {10=Val10, 20=Val20, 30=Val30, 40=Val40, 50=Val50, 60=Val60}

        // 18. Get NavigableSet View of Keys
        /*
         * Logic:
         * .navigableKeySet() returns a Set view that supports navigation methods (lower, higher, etc.)
         * unlike the standard .keySet().
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * No direct equivalent. C++ iterators allow navigation naturally.
         * Time Complexity: O(1) to get view.
         * ---------------------------------------------------------
         */
        NavigableSet<Integer> navKeys = map.navigableKeySet();
        System.out.println("18. Navigable KeySet: " + navKeys);

        // 21. Get SubMap from Key to Exclusive Key
        /*
         * Logic:
         * .subMap(fromKey, toKey) returns a view from fromKey (inclusive) to toKey (exclusive).
         * Default behavior is [start, end).
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterator pair [lower_bound(start), lower_bound(end)):
         * Time Complexity: O(log N) to find start/end points.
         * Space Complexity: O(1) (View).
         * ---------------------------------------------------------
         */
        System.out.println("21. SubMap (20 to 50 exclusive): " + map.subMap(20, 50));

        // 22. Get SubMap from Key to Key (Custom Inclusive)
        /*
         * Logic:
         * .subMap(from, boolean inclusive, to, boolean inclusive) gives full control.
         * Here we encompass 20 to 50 inclusive.
         * ---------------------------------------------------------
         */
        System.out.println("22. SubMap (20 to 50 inclusive): " + map.subMap(20, true, 50, true));

        // 23. Get TailMap from Inclusive Key
        /*
         * Logic:
         * .tailMap(fromKey) returns view of all keys >= fromKey.
         * Default is inclusive.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterator range [lower_bound(k), end()):
         * Time Complexity: O(log N) to find start.
         * ---------------------------------------------------------
         */
        System.out.println("23. TailMap (>= 40): " + map.tailMap(40));

        // 24. Get TailMap from Exclusive Key
        /*
         * Logic:
         * .tailMap(fromKey, false) returns view of keys > fromKey.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterator range [upper_bound(k), end()):
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        System.out.println("24. TailMap (> 40): " + map.tailMap(40, false));
    }
}