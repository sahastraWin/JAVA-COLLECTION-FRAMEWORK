package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class RemoveKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); map.put(1, "A");
        map.remove(1); System.out.println(map);
    }
}