package collectionFramework.Exercises.TreeMap;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.SortedMap;

public class TreeMapViews {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");

        // 10. Get Reverse View of TreeMap Keys
        /*
         * Logic:
         * .descendingKeySet() provides a view of keys in reverse order.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating using rbegin() and rend():
         * Time Complexity: O(1) to get view, O(N) to iterate.
         * ---------------------------------------------------------
         */
        System.out.println("10. Reverse Keys: " + map.descendingKeySet());

        // 13. Get Head Map with Keys Less Than Given Key (Strict <)
        /*
         * Logic:
         * .headMap(K) returns a view of the portion of the map strictly less than K.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating from begin() to lower_bound(k):
         * Time Complexity: O(log N) to find start point.
         * Space Complexity: O(1) (View).
         * ---------------------------------------------------------
         */
        SortedMap<Integer, String> headMapStrict = map.headMap(30);
        System.out.println("13. HeadMap (< 30): " + headMapStrict);

        // 14. Get Head Map with Optional Inclusive Key (<=)
        /*
         * Logic:
         * .headMap(K, boolean inclusive) allows specifying if the limit key is included.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterating from begin() to upper_bound(k):
         * Time Complexity: O(log N) to find cutoff.
         * Space Complexity: O(1) (View).
         * ---------------------------------------------------------
         */
        NavigableMap<Integer, String> headMapInclusive = map.headMap(30, true);
        System.out.println("14. HeadMap (<= 30): " + headMapInclusive);
    }
}