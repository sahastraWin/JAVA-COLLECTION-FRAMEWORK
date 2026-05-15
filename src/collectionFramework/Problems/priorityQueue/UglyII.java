package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class UglyII {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>(); pq.add(1L); Set<Long> s=new HashSet<>();
        long v=1; for(int i=0; i<n; i++){ v=pq.poll(); if(s.add(v*2)) pq.add(v*2); if(s.add(v*3)) pq.add(v*3); if(s.add(v*5)) pq.add(v*5); } return (int)v;
    }
}