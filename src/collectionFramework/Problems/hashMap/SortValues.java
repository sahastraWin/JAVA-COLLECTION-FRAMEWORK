package collectionFramework.Problems.hashMap;

import java.util.*;
public class SortValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 2); map.put("B", 1);
        List<Map.Entry<String, Integer>> l = new ArrayList<>(map.entrySet());
        l.sort(Map.Entry.comparingByValue()); System.out.println(l);
    }
}