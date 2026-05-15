package collectionFramework.Problems.treeSet;

import java.util.*;
public class RangeRemove {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        ts.subSet(2, true, 4, true).clear(); System.out.println(ts);
    }
}