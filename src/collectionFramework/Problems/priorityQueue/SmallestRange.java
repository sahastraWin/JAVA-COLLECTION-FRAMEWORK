package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class SmallestRange {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]); int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.size(); i++) { int v=nums.get(i).get(0); pq.add(new int[]{v, i, 0}); max=Math.max(max, v); }
        int minR=Integer.MAX_VALUE, s=-1, e=-1;
        while(pq.size()==nums.size()) {
            int[] c=pq.poll(); if(max-c[0]<minR){ minR=max-c[0]; s=c[0]; e=max; }
            if(c[2]+1<nums.get(c[1]).size()){ int n=nums.get(c[1]).get(c[2]+1); pq.add(new int[]{n, c[1], c[2]+1}); max=Math.max(max, n); }
        }
        return new int[]{s, e};
    }
}