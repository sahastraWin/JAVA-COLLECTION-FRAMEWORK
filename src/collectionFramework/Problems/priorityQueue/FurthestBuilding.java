package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class FurthestBuilding {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<h.length-1; i++){ int d=h[i+1]-h[i]; if(d>0){ pq.add(d); if(pq.size()>l) b-=pq.poll(); if(b<0) return i; } }
        return h.length-1;
    }
}