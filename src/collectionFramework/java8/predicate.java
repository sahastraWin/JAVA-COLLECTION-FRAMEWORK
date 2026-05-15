package collectionFramework.java8;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        //Predicate --> Functional Interface (boolean valued function).
        //It evaluates the predicate on the given argument.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(122));
        //Predicate holds a condition.
        //You are storing a condition inside a variable.
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(isWordStartingWithA.test("Abhijeet"));

    }
}
