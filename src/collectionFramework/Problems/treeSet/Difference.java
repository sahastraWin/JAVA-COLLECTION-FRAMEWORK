package collectionFramework.Problems.treeSet;

import java.util.*;
public class Difference {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>(Arrays.asList(1, 2, 3));
        TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(2, 3, 4));
        ts1.removeAll(ts2);
        System.out.println(ts1);
    }
}