package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class PrintOrder {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); pq.add(2); pq.add(1);
        while(!pq.isEmpty()) System.out.println(pq.poll());
    }
}