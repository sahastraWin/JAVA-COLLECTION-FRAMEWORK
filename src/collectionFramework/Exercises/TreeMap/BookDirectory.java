package collectionFramework.Exercises.TreeMap;
import java.util.TreeMap;
import java.util.Map;

public class BookDirectory {
    public static void main(String[] args) {
        /*
         * Logic:
         * We use a TreeMap<String, String> to store Book Title -> Author.
         * Since the keys are Strings, the TreeMap will automatically sort them
         * alphabetically (lexicographically).
         *
         * ---------------------------------------------------------
         * Complexity Analysis (C++ Context):
         * Equivalent to std::map<string, string>:
         * Time Complexity: O(K * log N) where K is the length of the string
         * (due to string comparisons during tree traversal).
         * Space Complexity: O(N * K) to store strings.
         * ---------------------------------------------------------
         */
        TreeMap<String, String> library = new TreeMap<>();

        library.put("The Great Gatsby", "F. Scott Fitzgerald");
        library.put("1984", "George Orwell"); // Numbers come before letters
        library.put("To Kill a Mockingbird", "Harper Lee");
        library.put("Brave New World", "Aldous Huxley");

        System.out.println("Library Directory (Alphabetical Order):");
        for (Map.Entry<String, String> book : library.entrySet()) {
            System.out.println("\"" + book.getKey() + "\" by " + book.getValue());
        }
    }
}