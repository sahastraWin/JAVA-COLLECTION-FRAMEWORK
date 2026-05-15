package collectionFramework.Problems.priorityQueue;

import java.util.PriorityQueue;
public class NullCheck {
    public static void main(String[] args) {
        try { new PriorityQueue<>().add(null); } catch(Exception e){ System.out.println("No Nulls"); }
    }
}