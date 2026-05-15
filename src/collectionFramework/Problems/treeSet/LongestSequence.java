package collectionFramework.Problems.treeSet;

import java.util.*;
public class LongestSequence {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        int longest = 0, current = 0, prev = Integer.MIN_VALUE;
        for (int n : ts) { if (n == prev + 1) current++; else current = 1; longest = Math.max(longest, current); prev = n; }
        System.out.println("Longest: " + longest);
    }
}