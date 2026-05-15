package collectionFramework.Problems.hashMap;

import java.util.*;
public class JsonMap {
    public static void main(String[] args) {
        Map<String, Object> j = new HashMap<>(); j.put("k", new HashMap<>(Map.of("sub", 1))); System.out.println(j);
    }
}