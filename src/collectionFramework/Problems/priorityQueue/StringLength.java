package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class StringLength {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(String::length)); pq.add("A"); pq.add("BB"); System.out.println(pq.poll());
    }
}