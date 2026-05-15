package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class GetTailSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(10); ts.add(20); ts.add(30);
        System.out.println(">= 20: " + ts.tailSet(20));
    }
}