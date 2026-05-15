package collectionFramework.Problems.treeSet;

import java.util.*;
public class MedianFinder {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1, 3, 2, 5, 4));
        Object[] arr = ts.toArray(); int n = arr.length;
        System.out.println("Median: " + ((n % 2 == 0) ? ((int)arr[n/2-1] + (int)arr[n/2]) / 2.0 : (int)arr[n/2]));
    }
}