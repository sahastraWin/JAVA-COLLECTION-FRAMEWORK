package collectionFramework.Problems.treeSet;

import java.util.*;
public class KthLargest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(5, 2, 8, 1, 3));
        int k = 2; Object[] arr = ts.toArray();
        System.out.println(k + "nd largest: " + arr[arr.length - k]);
    }
}