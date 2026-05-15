package collectionFramework.Exercises.LinkedList;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedListPart5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // 22. Check if particular element exists
        /*
         * Logic:
         * .contains(Object) performs a linear search.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::find() != end():
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        System.out.println("22. Contains 'Python'? " + list.contains("Python"));

        // 23. Convert LinkedList to ArrayList
        /*
         * Logic:
         * Pass the LinkedList to the ArrayList constructor.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to vector<T> v(list.begin(), list.end()):
         * Time Complexity: O(N).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        List<String> arrayList = new ArrayList<>(list);
        System.out.println("23. Converted to ArrayList: " + arrayList);

        // 24. Compare two LinkedLists
        /*
         * Logic:
         * .equals() checks size and element equality in order.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::equal():
         * Time Complexity: O(N).
         * ---------------------------------------------------------
         */
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Java"); list2.add("Python"); list2.add("C++");
        System.out.println("24. Lists are equal? " + list.equals(list2));

        // 25. Check if LinkedList is empty
        /*
         * Logic:
         * .isEmpty() checks if size == 0.
         * ---------------------------------------------------------
         * TC (C++): O(1) - empty().
         * ---------------------------------------------------------
         */
        System.out.println("25. Is list empty? " + list.isEmpty());

        // 26. Replace an element
        /*
         * Logic:
         * .set(index, element) replaces the element at the specified index.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to iterator dereference *it = val:
         * Time Complexity: O(K) to find the node at index K.
         * ---------------------------------------------------------
         */
        list.set(1, "Golang"); // Replace "Python" at index 1
        System.out.println("26. After Replacement: " + list);
    }
}