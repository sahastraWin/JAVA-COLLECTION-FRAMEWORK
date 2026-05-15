package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class KPairs {
    public List<List<Integer>> kSmallestPairs(int[] n1, int[] n2, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[0]+a[1])-(b[0]+b[1]));
        for(int x:n1) for(int y:n2) pq.add(new int[]{x,y});
        List<List<Integer>> r=new ArrayList<>(); while(k-->0 && !pq.isEmpty()){ int[] p=pq.poll(); r.add(Arrays.asList(p[0],p[1])); } return r;
    }
}