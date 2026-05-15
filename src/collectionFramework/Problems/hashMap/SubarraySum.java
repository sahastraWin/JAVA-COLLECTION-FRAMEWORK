package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class SubarraySum {
    public static void main(String[] args) {
        int[] n = {1, 1, 1}; int k=2; HashMap<Integer, Integer> m = new HashMap<>(); m.put(0, 1);
        int sum=0, c=0; for(int x:n) { sum+=x; c+=m.getOrDefault(sum-k, 0); m.put(sum, m.getOrDefault(sum, 0)+1); }
        System.out.println(c);
    }
}