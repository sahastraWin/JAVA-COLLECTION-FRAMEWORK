package collectionFramework.Problems.hashSet;

import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        int[] a = {1, 2}; int sum=3; HashSet<Integer> s = new HashSet<>();
        for(int n:a) { if(s.contains(sum-n)) System.out.println(n); s.add(n); }
    }
}