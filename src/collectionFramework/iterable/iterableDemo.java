package collectionFramework.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterableDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
////        Iterator<Integer> iterator=list.iterator();
////        while(iterator.hasNext())
////        {
////            System.out.println(iterator.next());
////        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //Concurrent Modification Exception will comel
//        for (Integer integer : numbers) {
//            if (integer % 2 == 0) {
//                numbers.remove(integer);
//            }
//        }
//        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
