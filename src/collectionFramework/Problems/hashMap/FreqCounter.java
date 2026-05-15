package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class FreqCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2}; HashMap<Integer, Integer> m = new HashMap<>();
        for(int n:arr) m.put(n, m.getOrDefault(n, 0)+1); System.out.println(m);
    }
}