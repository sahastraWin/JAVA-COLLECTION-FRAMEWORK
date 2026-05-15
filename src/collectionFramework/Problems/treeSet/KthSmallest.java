package collectionFramework.Problems.treeSet;

import java.util.*;
public class KthSmallest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(5, 2, 8, 1, 3));
        int k = 3; Integer res = (Integer) ts.toArray()[k-1];
        System.out.println(k + "rd smallest: " + res);
    }
}