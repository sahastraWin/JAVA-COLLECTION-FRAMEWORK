package collectionFramework.Problems.hashSet;

import java.util.*;
public class KDiffPairs {
    public static int findPairs(int[] n, int k) {
        Map<Integer, Integer> m = new HashMap<>(); for(int x:n) m.put(x, m.getOrDefault(x, 0)+1);
        int c=0; for(int x:m.keySet()) if(k==0?m.get(x)>1:m.containsKey(x+k)) c++; return c;
    }
}