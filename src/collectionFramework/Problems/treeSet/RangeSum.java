package collectionFramework.Problems.treeSet;

import java.util.*;
public class RangeSum {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int low = 2, high = 5, sum = 0;
        for(int n : ts.subSet(low, true, high, true)) sum += n;
        System.out.println("Sum [2, 5]: " + sum);
    }
}