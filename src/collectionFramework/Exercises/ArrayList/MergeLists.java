package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A"); list1.add("B");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C"); list2.add("D");

        /*
         * Logic:
         * We use the standard addAll() method which appends all elements
         * of the second collection to the first.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to vector::insert or creating a new vector with iterators:
         * Time Complexity: O(M) where M is the size of the second list (linear copy).
         * Space Complexity: O(N + M) to store the merged result.
         * ---------------------------------------------------------
         */
        ArrayList<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("Merged List: " + mergedList);
    }
}