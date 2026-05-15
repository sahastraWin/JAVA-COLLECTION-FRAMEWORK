package collectionFramework.Problems.priorityQueue;

import java.util.*;
class StockPrice {
    TreeMap<Integer, Integer> tp=new TreeMap<>(); TreeMap<Integer, Set<Integer>> pf=new TreeMap<>(); int t=0;
    public void update(int ts, int p) {
        t=Math.max(t, ts); if(tp.containsKey(ts)){ int o=tp.get(ts); pf.get(o).remove(ts); if(pf.get(o).isEmpty()) pf.remove(o); }
        tp.put(ts, p); pf.computeIfAbsent(p, k->new HashSet<>()).add(ts);
    }
    public int maximum() { return pf.lastKey(); }
}