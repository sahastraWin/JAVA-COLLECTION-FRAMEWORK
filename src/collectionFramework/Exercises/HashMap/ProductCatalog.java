package collectionFramework.Exercises.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    public static void main(String[] args) {
        /*
         * Logic:
         * Key = Product Name (String), Value = Price (Double).
         * Used for fast lookups of prices in a POS (Point of Sale) system scenario.
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::unordered_map<std::string, double>:
         * Time Complexity: O(1) Average.
         * Space Complexity: O(N).
         * ---------------------------------------------------------
         */
        Map<String, Double> products = new HashMap<>();

        products.put("Laptop", 999.99);
        products.put("Mouse", 25.50);
        products.put("Keyboard", 75.00);
        products.put("Monitor", 300.00);

        System.out.println("Product Price List:");
        // Using forEach (Java 8+) for cleaner iteration
        products.forEach((product, price) -> {
            System.out.println(product + ": $" + price);
        });
    }
}