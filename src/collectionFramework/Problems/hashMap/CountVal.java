package collectionFramework.Problems.hashMap;

import java.util.HashMap; import java.util.Collections;
public class CountVal {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1); map.put("B", 1);
        System.out.println(Collections.frequency(map.values(), 1));
    }
}