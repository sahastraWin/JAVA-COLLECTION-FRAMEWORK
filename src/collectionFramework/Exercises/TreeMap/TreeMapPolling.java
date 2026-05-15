package collectionFramework.Exercises.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapPolling {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        System.out.println("Initial Map: " + map);

        // 19. Poll First Entry from TreeMap
        /*
         * Logic:
         * .pollFirstEntry() retrieves and REMOVES the mapping with the lowest key.
         * Useful for processing queues sorted by priority/key.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to accessing begin() then erase():
         * Time Complexity: O(log N) (Tree rebalancing cost).
         * Space Complexity: O(1).
         * ---------------------------------------------------------
         */
        Map.Entry<Integer, String> first = map.pollFirstEntry();
        System.out.println("19. Polled First: " + first);
        System.out.println("    Map after pollFirst: " + map);

        // 20. Poll Last Entry from TreeMap
        /*
         * Logic:
         * .pollLastEntry() retrieves and REMOVES the mapping with the highest key.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to accessing rbegin() then erase():
         * Time Complexity: O(log N).
         * ---------------------------------------------------------
         */
        Map.Entry<Integer, String> last = map.pollLastEntry();
        System.out.println("20. Polled Last: " + last);
        System.out.println("    Map after pollLast: " + map);
    }
}