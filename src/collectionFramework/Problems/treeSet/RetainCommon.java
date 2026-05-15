package collectionFramework.Problems.treeSet;

import java.util.*;
public class RetainCommon {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>(Arrays.asList(1, 2));
        TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(2, 3));
        ts1.retainAll(ts2);
        System.out.println(ts1);
    }
}