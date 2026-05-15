package collectionFramework.Problems.hashMap;

import java.util.*;
class Twitter {
    Map<Integer, Set<Integer>> f = new HashMap<>(); Map<Integer, List<int[]>> t = new HashMap<>(); int tm=0;
    void post(int u, int tid) { t.computeIfAbsent(u, k->new ArrayList<>()).add(0, new int[]{tm++, tid}); }
}