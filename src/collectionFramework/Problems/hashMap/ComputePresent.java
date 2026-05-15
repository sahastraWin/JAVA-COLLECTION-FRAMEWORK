package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class ComputePresent {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 10);
        map.computeIfPresent("A", (k, v) -> v * 2); System.out.println(map);
    }
}