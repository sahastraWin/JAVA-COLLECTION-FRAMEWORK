package collectionFramework.Exercises.TreeMap;

import java.util.TreeMap;
import java.util.Map;

// A simple class to represent Student Details
class Student {
    String name;
    String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    @Override
    public String toString() {
        return name + " (" + major + ")";
    }
}

public class StudentDatabase {
    public static void main(String[] args) {
        /*
         * Logic:
         * We use Integer IDs as keys because TreeMap sorts keys naturally.
         * This ensures that when we iterate over the map, we get students
         * in ascending order of their ID numbers (101, 102, 103...).
         * The value is a custom 'Student' object.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map<int, StudentStruct>:
         * Time Complexity: O(log N) for insertion/lookup.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        TreeMap<Integer, Student> students = new TreeMap<>();

        students.put(103, new Student("Charlie", "Physics"));
        students.put(101, new Student("Alice", "Computer Science"));
        students.put(102, new Student("Bob", "Mathematics"));
        students.put(105, new Student("Eve", "Engineering"));

        System.out.println("Student Database (Sorted by ID):");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("ID " + entry.getKey() + ": " + entry.getValue());
        }
    }
}