package collectionFramework.Exercises.HashSet;
import java.util.HashSet;
import java.util.Set;

public class CheckExistence {
    public static void main(String[] args) {
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);

        int target = 5;
        int missing = 9;

        /*
         * Logic:
         * We use the .contains() method.
         * Since HashSet uses a hash table internally, this lookup is extremely fast
         * compared to searching in an ArrayList (which is O(N)).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_set::find():
         * Time Complexity: O(1) Average Case. (O(N) Worst case if hash collisions occur).
         * Space Complexity: O(1) - No extra space needed for the search operation.
         * ---------------------------------------------------------
         */

        if (primeNumbers.contains(target)) {
            System.out.println(target + " exists in the set.");
        } else {
            System.out.println(target + " does not exist.");
        }

        System.out.println("Does " + missing + " exist? " + primeNumbers.contains(missing));
    }
}