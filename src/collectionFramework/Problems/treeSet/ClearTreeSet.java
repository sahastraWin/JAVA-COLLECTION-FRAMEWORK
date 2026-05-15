package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class ClearTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(1);
        ts.clear();
        System.out.println("Size after clear: " + ts.size());
    }
}