package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class KthSmallest {
    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums) { pq.add(n); if(pq.size()>k) pq.poll(); } return pq.peek();
    }
}