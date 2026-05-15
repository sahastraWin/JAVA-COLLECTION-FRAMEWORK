package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class NavigableOps {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(10); ts.add(20); ts.add(30);
        System.out.println("L:" + ts.lower(20) + " F:" + ts.floor(20) + " C:" + ts.ceiling(20) + " H:" + ts.higher(20));
    }
}