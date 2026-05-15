package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class SlidingMax {
    public int[] maxSlidingWindow(int[] n, int k) {
        if(n.length==0) return new int[0]; PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] r=new int[n.length-k+1];
        for(int i=0; i<n.length; i++){ pq.add(n[i]); if(i>=k) pq.remove(n[i-k]); if(i>=k-1) r[i-k+1]=pq.peek(); } return r;
    }
}