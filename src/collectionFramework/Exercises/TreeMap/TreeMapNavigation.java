package collectionFramework.Exercises.TreeMap;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Low");
        map.put(20, "Medium");
        map.put(40, "High");
        map.put(50, "Highest");

        // 9. Get First and Last Key
        /*
         * Logic:
         * .firstKey() and .lastKey() return the lowest and highest keys currently in the map.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to map.begin()->first and map.rbegin()->first:
         * Time Complexity: O(log N) in Java (checking tree edges), O(1) in C++ (cached pointers).
         * ---------------------------------------------------------
         */
        System.out.println("9. First Key: " + map.firstKey());
        System.out.println("   Last Key: " + map.lastKey());

        // 8. Get Mapping with Greatest and Least Key
        /*
         * Logic:
         * .firstEntry() and .lastEntry() return the Key-Value pairs.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to dereferencing begin() and rbegin():
         * Time Complexity: O(log N) (finding edges).
         * ---------------------------------------------------------
         */
        System.out.println("8. First Entry: " + map.firstEntry());
        System.out.println("   Last Entry: " + map.lastEntry());

        // 12. Get Floor Key (Greatest key <= given key)
        // 11. Get Mapping with Floor Key
        /*
         * Logic:
         * .floorKey(K) returns the greatest key <= K.
         * .floorEntry(K) returns the Entry for that key.
         * Example: floorKey(25) in [10, 20, 40] is 20.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::upper_bound(k) - 1:
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        int search = 25;
        System.out.println("12. Floor Key for " + search + ": " + map.floorKey(search));
        System.out.println("11. Floor Entry for " + search + ": " + map.floorEntry(search));

        // 15. Get Higher Key (Least key > given key)
        /*
         * Logic:
         * .higherKey(K) returns the least key strictly greater than K.
         * Example: higherKey(20) in [10, 20, 40] is 40.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map::upper_bound(k):
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        System.out.println("15. Higher Key than 20: " + map.higherKey(20));
    }
}