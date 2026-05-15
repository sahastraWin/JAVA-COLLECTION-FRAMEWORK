package collectionFramework.Problems.hashSet;

import java.util.*;
public class Candies {
    public static int distributeCandies(int[] c) {
        HashSet<Integer> t = new HashSet<>(); for(int x:c) t.add(x); return Math.min(t.size(), c.length/2);
    }
}