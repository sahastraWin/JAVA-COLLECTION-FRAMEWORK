package collectionFramework.Problems.hashMap;

import java.util.*;
public class MapToList {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); map.put(1, "A");
        System.out.println(new ArrayList<>(map.keySet()));
    }
}