package collectionFramework.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class consumerAndSupplier {
    public static void main(String[] args) {
        Consumer<Integer> p = x -> System.out.println(x);
        p.accept(5);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        //consumer has no return type and hence it has no compose method
        printList.accept(list);

        //supplier as no default and static methods
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        //combined example
        Predicate<Integer>predicate=x->x%2==0;
        Function<Integer,Integer>function=x->x*x;
        Consumer<Integer>consumer=x-> System.out.println(x);
        Supplier<Integer>supplier=()->100;

        if(predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(supplier.get()));
        }
        // BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));
        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
    }
}
