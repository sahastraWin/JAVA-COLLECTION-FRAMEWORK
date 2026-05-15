package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class PQToList {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(3, 1));
        ArrayList<Integer> l = new ArrayList<>(); while(!pq.isEmpty()) l.add(pq.poll()); System.out.println(l);
    }
}