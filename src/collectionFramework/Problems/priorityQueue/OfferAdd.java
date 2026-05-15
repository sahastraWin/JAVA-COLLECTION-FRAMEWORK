package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class OfferAdd {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(); pq.offer("A"); pq.add("B"); System.out.println(pq);
    }
}