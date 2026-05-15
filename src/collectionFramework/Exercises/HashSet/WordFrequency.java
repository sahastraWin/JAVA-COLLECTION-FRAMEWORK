package collectionFramework.Exercises.HashSet;
import java.util.TreeMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java code code java python java c++";

        /*
         * Logic:
         * A TreeMap stores keys in sorted order (Alphabetical for Strings).
         * We split the string by spaces to get words.
         * We loop through words and update the count in the map.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map (Red-Black Tree implementation):
         * Time Complexity: O(N log K) where N is total words, K is unique words.
         * (Insertion/Lookup in Tree is log K).
         * Space Complexity: O(K) to store unique words.
         * ---------------------------------------------------------
         */
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        String[] words = text.split("\\s+"); // Split by whitespace

        for (String word : words) {
            // getOrDefault returns current count if exists, else 0
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies (Sorted):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}