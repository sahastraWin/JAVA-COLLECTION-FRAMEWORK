package collectionFramework.Problems.hashMap;

import java.util.*;
public class TopK {
    public static void main(String[] args) {
        int[] n = {1,1,2}; int k=1; Map<Integer, Integer> m = new HashMap<>();
        for(int x:n) m.put(x, m.getOrDefault(x,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int x:m.keySet()) { pq.add(x); if(pq.size()>k) pq.poll(); }
        System.out.println(pq);
    }
}