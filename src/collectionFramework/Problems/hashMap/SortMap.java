package collectionFramework.Problems.hashMap;

import java.util.*;
public class SortMap {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>(); m.put("A", 3); m.put("B", 1);
        List<Map.Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
        l.sort(Map.Entry.comparingByValue()); System.out.println(l);
    }
}