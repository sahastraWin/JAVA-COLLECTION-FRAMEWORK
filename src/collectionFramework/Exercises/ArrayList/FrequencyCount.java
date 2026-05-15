package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Pen"); items.add("Book"); items.add("Pen"); items.add("Pen"); items.add("Book");

        /*
         * Logic:
         * We use a HashMap to store the element as Key and count as Value.
         * If the key exists, increment count; otherwise, initialize to 1.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to using std::map or std::unordered_map:
         * Time Complexity: O(N) using HashMap (average case).
         * Space Complexity: O(K) where K is the number of unique elements.
         * ---------------------------------------------------------
         */
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}