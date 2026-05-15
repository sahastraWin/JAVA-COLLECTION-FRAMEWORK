package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class KthMatrix {
    public int kthSmallest(int[][] m, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int[] r:m) for(int n:r){ pq.add(n); if(pq.size()>k) pq.poll(); } return pq.peek();
    }
}