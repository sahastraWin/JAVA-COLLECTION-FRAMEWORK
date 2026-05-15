package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class PutIfAbsent {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1);
        map.putIfAbsent("A", 2); System.out.println(map);
    }
}