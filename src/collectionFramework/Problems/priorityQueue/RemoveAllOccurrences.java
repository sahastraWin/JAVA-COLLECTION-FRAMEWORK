package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class RemoveAllOccurrences {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(1, 1)); pq.removeAll(Arrays.asList(1)); System.out.println(pq);
    }
}