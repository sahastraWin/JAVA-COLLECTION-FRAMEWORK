package collectionFramework.java8;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        //Function --> works for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        doubleIt.andThen(tripleIt);
        System.out.println(doubleIt.apply(100));
        Function<Integer, Integer> identity = Function.identity();
        Integer ans = identity.apply(5);
        System.out.println(ans);
    }
}
