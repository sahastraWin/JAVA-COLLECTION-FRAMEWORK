package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class ComputeVal {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1);
        map.compute("A", (k, v) -> v == null ? 1 : v + 10); System.out.println(map);
    }
}