package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class ValIter {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1);
        for(Integer val : map.values()) System.out.println(val);
    }
}