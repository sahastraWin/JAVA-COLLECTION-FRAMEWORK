package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
class KthLargestStream {
    PriorityQueue<Integer> pq=new PriorityQueue<>(); int k;
    KthLargestStream(int k, int[] n){this.k=k; for(int x:n) add(x);}
    int add(int v){ pq.add(v); if(pq.size()>k) pq.poll(); return pq.peek(); }
}