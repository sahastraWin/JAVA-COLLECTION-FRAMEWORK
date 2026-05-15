package collectionFramework.Problems.hashSet;

import java.util.*;
public class SubsetCheck {
    public static boolean isSubset(int[] a, int[] b) {
        HashSet<Integer> s = new HashSet<>(); for(int n:a) s.add(n);
        for(int n:b) if(!s.contains(n)) return false; return true;
    }
}