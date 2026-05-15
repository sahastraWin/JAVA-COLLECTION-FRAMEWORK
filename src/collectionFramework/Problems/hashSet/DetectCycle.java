package collectionFramework.Problems.hashSet;

import java.util.*;
public class DetectCycle {
    public static boolean hasCycle(int[] a) {
        HashSet<Integer> v = new HashSet<>(); int c=0;
        while(c<a.length && c>=0) { if(!v.add(c)) return true; c=a[c]; } return false;
    }
}