package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class Ordering {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); pq.add(1); System.out.println(pq.peek());
    }
}