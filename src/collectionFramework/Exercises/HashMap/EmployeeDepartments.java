package collectionFramework.Exercises.HashMap;

import java.util.HashMap;

public class EmployeeDepartments {
    public static void main(String[] args) {
        /*
         * Logic:
         * Key = Employee ID (Integer), Value = Department (String).
         * This demonstrates mapping an ID to a categorical string.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map<int, std::string>:
         * Time Complexity: O(1) Average.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        HashMap<Integer, String> deptMap = new HashMap<>();

        deptMap.put(101, "Engineering");
        deptMap.put(102, "Human Resources");
        deptMap.put(103, "Marketing");
        deptMap.put(104, "Engineering"); // Multiple IDs can belong to the same Dept

        System.out.println("Department Assignments:");

        // KeySet iteration
        for (Integer id : deptMap.keySet()) {
            String dept = deptMap.get(id);
            System.out.println("ID " + id + " is assigned to " + dept);
        }
    }
}