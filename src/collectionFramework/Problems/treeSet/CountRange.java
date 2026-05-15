package collectionFramework.Problems.treeSet;

import java.util.*;
public class CountRange {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1, 5, 10, 15, 20));
        System.out.println("Count [5, 15]: " + ts.subSet(5, true, 15, true).size());
    }
}