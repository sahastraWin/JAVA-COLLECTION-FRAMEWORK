package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class MergeDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); map.put("M", "H");
        map.merge("M", " W", (o, n) -> o + n); System.out.println(map);
    }
}