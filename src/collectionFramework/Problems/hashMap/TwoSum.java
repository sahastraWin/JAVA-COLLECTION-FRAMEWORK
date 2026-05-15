package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int[] n = {2, 7, 11}; int t = 9; HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<n.length; i++) { if(m.containsKey(t-n[i])) System.out.println(m.get(t-n[i]) + " " + i); m.put(n[i], i); }
    }
}