package collectionFramework.Problems.treeSet;

import java.util.*;
public class Union {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>(Arrays.asList(1, 2));
        TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(2, 3));
        TreeSet<Integer> union = new TreeSet<>(ts1); union.addAll(ts2);
        System.out.println(union);
    }
}