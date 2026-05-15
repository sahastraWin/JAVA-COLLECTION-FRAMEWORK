package collectionFramework.Problems.treeSet;

import java.util.*;
public class DedupeSort {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 2, 1, 3};
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(arr));
        System.out.println(ts);
    }
}