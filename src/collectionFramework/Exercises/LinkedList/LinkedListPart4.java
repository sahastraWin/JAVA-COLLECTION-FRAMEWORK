package collectionFramework.Exercises.LinkedList;

import java.util.LinkedList;

public class LinkedListPart4 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A"); list1.add("B");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("C"); list2.add("D");

        // 17. Join two linked lists
        /*
         * Logic:
         * .addAll() appends the second list to the first.
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::list::splice() (O(1) constant time if moving nodes!):
         * Java copies nodes (O(M)), C++ simply relinks pointers (O(1)).
         * ---------------------------------------------------------
         */
        LinkedList<String> joined = new LinkedList<>(list1);
        joined.addAll(list2);
        System.out.println("17. Joined List: " + joined);

        // 18. Copy linked list to another
        /*
         * Logic:
         * Using constructor or .clone() creates a shallow copy.
         * ---------------------------------------------------------
         * TC (C++): O(N) - Copy constructor.
         * ---------------------------------------------------------
         */
        LinkedList<String> copy = new LinkedList<>(joined);
        System.out.println("18. Copied List: " + copy);

        // 19. Remove and Return First Element
        /*
         * Logic:
         * .pop() or .removeFirst() (Deque interface methods).
         * ---------------------------------------------------------
         * TC (C++): O(1) - pop_front().
         * ---------------------------------------------------------
         */
        String removed = joined.pop();
        System.out.println("19. Removed & Returned First: " + removed);

        // 20. Retrieve, but not remove, First Element
        /*
         * Logic:
         * .peekFirst() or .getFirst().
         * ---------------------------------------------------------
         * TC (C++): O(1) - front().
         * ---------------------------------------------------------
         */
        System.out.println("20. Retrieve First (Peek): " + joined.peekFirst());

        // 21. Retrieve, but not remove, Last Element
        /*
         * Logic:
         * .peekLast() or .getLast().
         * ---------------------------------------------------------
         * TC (C++): O(1) - back().
         * ---------------------------------------------------------
         */
        System.out.println("21. Retrieve Last (Peek): " + joined.peekLast());
    }
}