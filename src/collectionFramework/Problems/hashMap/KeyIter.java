package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class KeyIter {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1);
        for(String key : map.keySet()) System.out.println(key);
    }
}