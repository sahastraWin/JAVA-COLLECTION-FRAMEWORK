package collectionFramework.Exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StructureChanges {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1); nums1.add(2); nums1.add(3); nums1.add(4); nums1.add(5);

        // 11. Reverse ArrayList
        /* * TC (C++): O(N) - std::reverse
         * SC (C++): O(1)
         */
        Collections.reverse(nums1);
        System.out.println("11. Reversed: " + nums1);

        // 12. Extract Sublist
        /* * Logic: Returns a view of the portion of the list.
         * TC (C++): O(1) for iterator creation, O(K) if copying to new vector.
         */
        List<Integer> sub = nums1.subList(1, 4); // Indices 1 to 3
        System.out.println("12. Sublist (1-4): " + sub);

        // 13. Compare Two ArrayLists
        /* * TC (C++): O(N) - operator==
         */
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(5); nums2.add(4); nums2.add(3); nums2.add(2); nums2.add(1);
        boolean isEqual = nums1.equals(nums2);
        System.out.println("13. Are lists equal? " + isEqual);

        // 14. Swap ArrayList Elements
        /* * TC (C++): O(1) - std::swap
         */
        Collections.swap(nums1, 0, 4);
        System.out.println("14. Swapped index 0 and 4: " + nums1);

        // 15. Join Two ArrayLists
        /* * TC (C++): O(M) where M is size of second list - vector::insert
         * SC (C++): O(N+M)
         */
        ArrayList<Integer> joined = new ArrayList<>(nums1);
        joined.addAll(nums2);
        System.out.println("15. Joined List: " + joined);
    }
}