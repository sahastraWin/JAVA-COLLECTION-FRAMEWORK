package collectionFramework.Exercises.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class BasicTreeMap {
    public static void main(String[] args) {
        /*
         * Logic:
         * A TreeMap is a Red-Black tree based implementation of the Map interface.
         * Unlike HashMap, it guarantees that the keys will be sorted in their natural order
         * (or by a custom comparator provided at creation time).
         * Here, we use Integer keys, so they will be sorted numerically (1, 2, 3...).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map in C++ (Balanced Binary Search Tree):
         * Time Complexity:
         * - Insertion: O(log N)
         * - Lookup: O(log N)
         * - Traversal: O(N)
         * Space Complexity: O(N)
         * ---------------------------------------------------------
         */
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements in random order
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");

        System.out.println("TreeMap (Sorted by Key):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}