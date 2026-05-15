package collectionFramework.Problems.treeSet;

import java.util.*;
public class StringLengthSort {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        ts.add("Apple"); ts.add("Fig"); ts.add("Banana");
        System.out.println(ts);
    }
}