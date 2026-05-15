package collectionFramework.hashMap;

import java.util.*;

public class immutableHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);//creating a view od the original map
        System.out.println(map2);
        //map2.put("D",4); throws UnsupportedOperationException
        Map<String, Integer> map3 = Map.of("jeet", 23, "tejam", 4);//max 10 entries allowed
        System.out.println(map3);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Ayush", 78), Map.entry("Javesh", 89));
        System.out.println(map4);
    }
}
