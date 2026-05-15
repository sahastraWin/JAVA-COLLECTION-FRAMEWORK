package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class ReversePQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); pq.add(1); System.out.println(pq.peek());
    }
}