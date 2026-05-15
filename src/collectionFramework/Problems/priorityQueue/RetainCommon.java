package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class RetainCommon {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Arrays.asList(1, 2)), q2 = new PriorityQueue<>(Arrays.asList(2));
        q1.retainAll(q2); System.out.println(q1);
    }
}