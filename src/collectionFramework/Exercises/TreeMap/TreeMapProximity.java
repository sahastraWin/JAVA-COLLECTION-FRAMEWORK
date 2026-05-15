package collectionFramework.Exercises.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapProximity {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(40, "Forty");
        map.put(50, "Fifty");

        int searchKey = 30;

        // 17. Get Lower Key in TreeMap
        /*
         * Logic:
         * .lowerKey(K) returns the greatest key strictly less than K.
         * For 30, strictly less keys are 10, 20. The greatest is 20.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::lower_bound(k) decrement iterator:
         * Time Complexity: O(log N).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        System.out.println("17. Lower Key than " + searchKey + ": " + map.lowerKey(searchKey));

        // 16. Get Mapping with Lower Key
        /*
         * Logic:
         * .lowerEntry(K) returns the Map.Entry for the lower key.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        System.out.println("16. Lower Entry than " + searchKey + ": " + map.lowerEntry(searchKey));

        // 26. Get Ceiling Key in TreeMap
        /*
         * Logic:
         * .ceilingKey(K) returns the least key greater than or equal to K.
         * For 30, keys >= 30 are 40, 50. The least is 40.
         * If searchKey was 40, it would return 40.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::lower_bound(k):
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        System.out.println("26. Ceiling Key for " + searchKey + ": " + map.ceilingKey(searchKey));

        // 25. Get Mapping with Ceiling Key
        /*
         * Logic:
         * .ceilingEntry(K) returns the Map.Entry for the ceiling key.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        System.out.println("25. Ceiling Entry for " + searchKey + ": " + map.ceilingEntry(searchKey));
    }
}