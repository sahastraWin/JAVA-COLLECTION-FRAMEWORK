package collectionFramework.hashMap;

import java.util.*;

public class linkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>(11, 0.3f, true);//double linked list
        lhmap.put("Orange : ", 10);
        lhmap.put("Mango  : ", 20);
        lhmap.put("Apple  : ", 30);
        //id the access order is false , the elements are store in the insertion order.(default access order is false)
        //insertion order is same as given by the user.
        lhmap.get("Mango");

        for (Map.Entry<String, Integer> entry : lhmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //caching : cache eviction strategy , least recently used item is removed to reserve the memory
        HashMap<String, Integer> hmaps = new HashMap<>();
        LinkedHashMap<String, Integer> hs = new LinkedHashMap<>(hmaps);

        hmaps.put("jeet", 89);
        hmaps.put("meet", 87);
        Integer res = hmaps.getOrDefault("preet", 12);
        System.out.println(res);
        hmaps.putIfAbsent("jeet", 91);
        hmaps.putIfAbsent("preet", 92);
        System.out.println(hmaps);
    }
}