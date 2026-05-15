package collectionFramework.Problems.hashMap;

import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); map.put(1, "A");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}