package collectionFramework.Problems.hashMap;

import java.util.*;
public class SyncMap {
    public static void main(String[] args) {
        Map<Integer, String> m = Collections.synchronizedMap(new HashMap<>()); m.put(1, "A");
        synchronized(m) { System.out.println(m); }
    }
}