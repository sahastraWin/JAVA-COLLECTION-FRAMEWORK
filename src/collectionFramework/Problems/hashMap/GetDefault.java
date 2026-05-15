package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class GetDefault {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map.getOrDefault("A", 0));
    }
}