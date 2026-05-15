package collectionFramework.maps;

import java.util.*;

public class Sortedmaps {
    public static void main(String[] args) {
        //if you want to sort elements on the basis of keys you have to use sortedMap
        SortedMap<Integer, String> smap = new TreeMap<>((a, b) -> b - a);
        //will be printed in descending order
        smap.put(21, "jeet");
        smap.put(2, "yash");
        smap.put(23, "jay");
        //sorting time willbe of logN
        System.out.println(smap);

        System.out.println(smap.firstKey());
        System.out.println(smap.lastKey());
        System.out.println(smap.headMap(21));//will be excluded
        System.out.println(smap.tailMap(21));//will be included

    }
}
