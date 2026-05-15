package collectionFramework.set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class setCollection {
    public static void main(String[] args) {
        //set is a collection that cannot contain duplicate elements
        //faster operations
        //Map --> HashMap,TreeMap,LinkedHashMap,EnumMap
        //Set --> HashSet,TreeSet,LinkedHashSet,EnumSet
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(67);
        System.out.println(set);

        //for thread safety
        //dont't use this
        // Set<Integer> integers = Collections.synchronizedSet(set);
        Set<Integer> set1 = new ConcurrentSkipListSet<>();//it has built-in thread safety
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5, 7, 8, 89, 9);//can contain many elemets as compared to Map.of method
        System.out.println(integers);



    }
}
