package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7); list.add(10); list.add(4); list.add(3); list.add(20);
        int k = 3;

        /*
         * Logic:
         * The most straightforward way is to sort the list and pick the element at index k-1.
         * Note: For extremely large lists, a PriorityQueue (Max-Heap) of size K
         * or QuickSelect algorithm would be faster (O(N)), but Sort is standard for O(N log N).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::sort followed by access, or std::nth_element:
         * Time Complexity: O(N log N) with Sort. (O(N) if using QuickSelect/std::nth_element).
         * Space Complexity: O(log N) stack space for sort.
         * ---------------------------------------------------------
         */
        if (k > 0 && k <= list.size()) {
            Collections.sort(list);
            System.out.println(k + "th smallest element: " + list.get(k - 1));
        } else {
            System.out.println("Invalid K value");
        }
    }
}