package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class StockSpan {
    public static void main(String[] args) {
        TreeSet<Integer> p = new TreeSet<>(); p.add(100); p.add(80);
        System.out.println("Higher than 90? " + p.higher(90));
    }
}