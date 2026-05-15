package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class ForEachDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); map.put(1, "O");
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}