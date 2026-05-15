package collectionFramework.Exercises.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Arrays;

public class TreeSetNavigation {
    public static void main(String[] args) {
        // Initialize TreeSet with Integers
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 10));
        System.out.println("Original Set: " + numbers);

        // 4. Reverse Order TreeSet
        /*
         * Logic:
         * .descendingSet() returns a view of the set in reverse order.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to using reverse_iterator (rbegin, rend):
         * Time Complexity: O(1) to get view, O(N) to traverse.
         * ---------------------------------------------------------
         */
        System.out.println("4. Reverse View: " + numbers.descendingSet());

        // 5. Get First and Last TreeSet Elements
        /*
         * Logic:
         * .first() returns the lowest element.
         * .last() returns the highest element.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to *begin() and *rbegin():
         * Time Complexity: O(1) (Amortized/Cached).
         * ---------------------------------------------------------
         */
        System.out.println("5. First: " + numbers.first());
        System.out.println("   Last: " + numbers.last());

        // 9. Elements Less Than 7 in TreeSet
        /*
         * Logic:
         * .headSet(E) returns elements strictly less than E.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to lower_bound(7):
         * Time Complexity: O(log N) to find the cutoff.
         * ---------------------------------------------------------
         */
        System.out.println("9. Elements < 7: " + numbers.headSet(7));

        /* * PROXIMITY SEARCH LOGIC:
         * Ceiling(x): Least element >= x
         * Floor(x): Greatest element <= x
         * Higher(x): Least element > x
         * Lower(x): Greatest element < x
         * ---------------------------------------------------------
         * C++ Equivalents:
         * Ceiling -> lower_bound(x)
         * Floor -> upper_bound(x) decrement iterator
         * Higher -> upper_bound(x)
         * Lower -> lower_bound(x) decrement iterator
         * Time Complexity for all: O(log N)
         * ---------------------------------------------------------
         */
        int check = 6;

        // 10. TreeSet Ceiling Element (>= 6 -> 7)
        System.out.println("10. Ceiling of " + check + ": " + numbers.ceiling(check));

        // 11. TreeSet Floor Element (<= 6 -> 5)
        System.out.println("11. Floor of " + check + ": " + numbers.floor(check));

        // 12. TreeSet Higher Element (> 6 -> 7)
        System.out.println("12. Higher than " + check + ": " + numbers.higher(check));

        // 13. TreeSet Lower Element (< 6 -> 5)
        System.out.println("13. Lower than " + check + ": " + numbers.lower(check));
    }
}