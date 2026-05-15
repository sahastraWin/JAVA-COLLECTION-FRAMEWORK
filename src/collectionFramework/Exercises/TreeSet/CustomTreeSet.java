package collectionFramework.Exercises.TreeSet;
import java.util.TreeSet;

// Custom Class implementing Comparable
// This enforces a "natural ordering" for objects of this class
class Student implements Comparable<Student> {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Sorting Logic: Sort by Score (High to Low).
    // If scores are equal, sort by Name (A-Z).
    @Override
    public int compareTo(Student other) {
        // Compare scores
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score); // Descending order
        }
        // Tie-breaker: Compare names lexicographically
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class CustomTreeSet {
    public static void main(String[] args) {
        /*
         * Logic:
         * When storing custom objects in a TreeSet, the class MUST implement Comparable
         * (or a Comparator must be passed to the constructor).
         * The Red-Black tree uses the compareTo() method to determine where to place the node.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::set<Student> where Student struct has `operator<` overloaded:
         * Time Complexity:
         * - Insertion: O(log N) * C (where C is the cost of comparison).
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeSet<Student> leaderboard = new TreeSet<>();

        leaderboard.add(new Student("Alice", 85));
        leaderboard.add(new Student("Bob", 92));
        leaderboard.add(new Student("Charlie", 85)); // Same score as Alice
        leaderboard.add(new Student("David", 98));

        System.out.println("Leaderboard (Sorted by Score Desc, then Name):");
        for (Student s : leaderboard) {
            System.out.println(s);
        }
    }
}