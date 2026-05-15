package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class CountElements {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(1); ts.add(2);
        System.out.println("Count: " + ts.size());
    }
}