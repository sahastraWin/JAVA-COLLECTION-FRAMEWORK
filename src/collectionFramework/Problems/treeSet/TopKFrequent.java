package collectionFramework.Problems.treeSet;

import java.util.*;
public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3}; int k = 2;
        Map<Integer, Integer> map = new HashMap<>(); for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        TreeSet<Integer> ts = new TreeSet<>((a, b) -> { int f1 = map.get(a), f2 = map.get(b); return f1 != f2 ? f2 - f1 : a - b; });
        ts.addAll(map.keySet());
        int count = 0; for(int n : ts) { if(count++ >= k) break; System.out.print(n + " "); }
    }
}