package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class ContainsElement {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(10);
        System.out.println("Contains 10? " + ts.contains(10));
    }
}