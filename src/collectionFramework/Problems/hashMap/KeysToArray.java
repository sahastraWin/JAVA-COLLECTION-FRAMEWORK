package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class KeysToArray {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1);
        System.out.println(java.util.Arrays.toString(map.keySet().toArray()));
    }
}