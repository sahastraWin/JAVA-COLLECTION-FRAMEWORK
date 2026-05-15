package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class PriorityQueueBehavior {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(10); ts.add(5); ts.add(20);
        System.out.println("Min: " + ts.pollFirst() + " Max: " + ts.pollLast());
    }
}