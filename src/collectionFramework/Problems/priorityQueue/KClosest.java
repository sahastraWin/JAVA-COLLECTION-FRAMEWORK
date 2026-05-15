package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class KClosest {
    public int[][] kClosest(int[][] p, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        for(int[] x:p){ pq.add(x); if(pq.size()>k) pq.poll(); } return pq.toArray(new int[0][]);
    }
}