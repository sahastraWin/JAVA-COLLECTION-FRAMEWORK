package collectionFramework.Problems.hashMap;

import java.util.*;
public class SortKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); map.put(2, "B"); map.put(1, "A");
        System.out.println(new TreeMap<>(map));
    }
}