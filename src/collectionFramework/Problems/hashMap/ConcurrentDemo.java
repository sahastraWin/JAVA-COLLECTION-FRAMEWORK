package collectionFramework.Problems.hashMap;

import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<>(); m.put("A", 1); System.out.println(m);
    }
}