package collectionFramework.Problems.treeSet;

import java.util.*;
public class ReverseSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        ts.add(1); ts.add(2);
        System.out.println(ts);
    }
}