package collectionFramework.Problems.hashMap;

import java.util.*;
public class NestedMap {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> m = new HashMap<>();
        m.put("A", new HashMap<>()); m.get("A").put("Math", 95); System.out.println(m);
    }
}