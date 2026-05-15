package collectionFramework.Exercises.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomObjectPQ {
    public static void main(String[] args) {
        /*
         * Logic:
         * We use a Lambda expression to define a custom sorting logic.
         * Here, we prioritize Strings based on their length (Shortest strings first).
         * If lengths are equal, we could add a secondary tie-breaker (lexicographical),
         * but here we keep it simple.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::priority_queue with a custom struct comparator:
         * Time Complexity: O(log N) * (Cost of Comparison).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        // Comparator: Compare string lengths
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        PriorityQueue<String> pq = new PriorityQueue<>(lengthComparator);

        pq.add("Elephant");
        pq.add("Cat");
        pq.add("Hippopotamus");
        pq.add("Dog");

        System.out.println("Strings sorted by length:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}