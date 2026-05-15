package collectionFramework.java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class operator {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;
    }
}
