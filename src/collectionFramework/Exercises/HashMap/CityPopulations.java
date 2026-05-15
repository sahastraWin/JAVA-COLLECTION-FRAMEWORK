package collectionFramework.Exercises.HashMap;
import java.util.HashMap;

public class CityPopulations {
    public static void main(String[] args) {
        /*
         * Logic:
         * Key = City (String), Value = Population (Integer/Long).
         * We use Long for population to prevent integer overflow for large cities.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map<std::string, long>:
         * Time Complexity: O(1) Average.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        HashMap<String, Long> cityStats = new HashMap<>();

        cityStats.put("New York", 8419600L);
        cityStats.put("Los Angeles", 3980400L);
        cityStats.put("Chicago", 2716000L);

        // Printing specific city data
        System.out.println("Population of New York: " + cityStats.get("New York"));

        // Updating a value (Keys must be unique, so 'put' updates existing keys)
        cityStats.put("New York", 8500000L);
        System.out.println("Updated Population of New York: " + cityStats.get("New York"));
    }
}