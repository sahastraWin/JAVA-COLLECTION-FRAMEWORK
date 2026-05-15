package collectionFramework.Exercises.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

class SortByStringLength implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}

public class TreeMapSorting {
    public static void main(String[] args) {
        // 7. Sort TreeMap Keys with Comparator
        /*
         * Logic:
         * By default, TreeMap uses "Natural Ordering".
         * To sort differently (e.g., by String length), we pass a Comparator to the constructor.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map<string, value, CustomComparator>:
         * Time Complexity: O(log N) per insertion (Comparison cost is higher but still constant relative to N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new SortByStringLength());

        sortedMap.put("Apple", 1);
        sortedMap.put("Kiwi", 2);
        sortedMap.put("Banana", 3);

        // Keys should be sorted by length: Kiwi(4), Apple(5), Banana(6)
        System.out.println("7. TreeMap Sorted by Key Length: " + sortedMap);
    }
}