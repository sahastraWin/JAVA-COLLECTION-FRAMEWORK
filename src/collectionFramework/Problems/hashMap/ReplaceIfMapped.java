package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class ReplaceIfMapped {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); map.put(1, "Old");
        map.replace(1, "Old", "New"); System.out.println(map);
    }
}