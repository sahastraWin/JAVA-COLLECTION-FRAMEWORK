package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class FindMax {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); pq.add(10); pq.add(20);
        int max=Integer.MIN_VALUE; for(int n:pq) max=Math.max(max, n); System.out.println(max);
    }
}