package collectionFramework.Exercises.TreeMap;
import java.util.TreeMap;
import java.util.Map;

public class WordFrequencySorted {
    public static void main(String[] args) {
        String text = "banana apple orange apple banana apple cherry";

        /*
         * Logic:
         * We split the text into words.
         * We iterate through the array, updating the count in the TreeMap.
         * Because we use a TreeMap, the final output will list words alphabetically
         * (e.g., apple, then banana, then cherry), unlike a HashMap which is unordered.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map<string, int>:
         * Time Complexity: O(M * log K) where M is total words in text,
         * and K is number of unique words (map size).
         * Space Complexity: O(K) to store unique words.
         * ---------------------------------------------------------
         */
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies (Sorted A-Z):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}