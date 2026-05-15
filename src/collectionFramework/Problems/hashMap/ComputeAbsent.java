package collectionFramework.Problems.hashMap;

import java.util.HashMap; import java.util.ArrayList; import java.util.List;
public class ComputeAbsent {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        map.computeIfAbsent("F", k -> new ArrayList<>()).add("A"); System.out.println(map);
    }
}