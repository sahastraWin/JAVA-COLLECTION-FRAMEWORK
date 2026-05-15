package collectionFramework.Exercises.ArrayList;
import java.util.ArrayList;

public class MemoryState {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java"); list.add("Python");

        // 16. Clone ArrayList
        /* * Logic: clone() creates a shallow copy.
         * TC (C++): O(N)
         */
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("16. Cloned: " + clonedList);

        // 17. Clear ArrayList
        /* * TC (C++): O(N) (destructors called) or O(1) for scalar types - vector::clear
         */
        list.clear();
        System.out.println("17. List after clear: " + list);

        // 18. Check if ArrayList is Empty
        /* * TC (C++): O(1) - vector::empty
         */
        System.out.println("18. Is list empty? " + list.isEmpty());

        // 19. Trim ArrayList Capacity
        /* * Logic: Trims the internal array to the current size of the list to save memory.
         * TC (C++): O(N) (Reallocation/Copy) - shrink_to_fit()
         */
        list.add("Data");
        list.trimToSize();
        System.out.println("19. Trimmed capacity to size.");

        // 20. Increase ArrayList Capacity
        /* * Logic: Pre-allocates memory to avoid resizing overhead during additions.
         * TC (C++): O(N) (if reallocation needed) - reserve()
         */
        list.ensureCapacity(100);
        System.out.println("20. Capacity increased to guarantee 100 elements.");
    }
}