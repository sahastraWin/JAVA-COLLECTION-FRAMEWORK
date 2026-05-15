package collectionFramework.Problems.treeSet;

import java.util.*;
public class ChainComparator {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        ts.add("B"); ts.add("A"); ts.add("AA");
        System.out.println(ts);
    }
}