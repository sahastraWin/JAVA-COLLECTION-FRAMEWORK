package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class RemoveFirst {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(); ts.add("A"); ts.add("B");
        ts.remove("A");
        System.out.println(ts);
    }
}