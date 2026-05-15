package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class DescendingOrder {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(1); ts.add(2); ts.add(3);
        System.out.println("Descending: " + ts.descendingSet());
    }
}