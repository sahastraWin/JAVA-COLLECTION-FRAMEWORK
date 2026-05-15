package collectionFramework.Exercises.HashMap;

import java.util.HashMap;

public class EmployeeDirectory {
    public static void main(String[] args) {
        /*
         * Logic:
         * Key = Employee ID (Integer), Value = Name (String).
         * Integer keys usually provide very efficient hashing (often the integer itself).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map<int, std::string>:
         * Time Complexity: O(1) Average for insertion and lookup.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice Smith");
        employees.put(102, "Bob Jones");
        employees.put(103, "Charlie Day");

        int searchId = 102;

        // Check existence before retrieval
        if (employees.containsKey(searchId)) {
            System.out.println("Employee with ID " + searchId + ": " + employees.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
    }
}