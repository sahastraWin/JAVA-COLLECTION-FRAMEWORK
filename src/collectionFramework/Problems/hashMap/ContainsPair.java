package collectionFramework.Problems.hashMap;

import java.util.HashMap; import java.util.Objects;
public class ContainsPair {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 100);
        System.out.println(map.containsKey("A") && Objects.equals(map.get("A"), 100));
    }
}