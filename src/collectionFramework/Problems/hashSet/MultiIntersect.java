package collectionFramework.Problems.hashSet;

import java.util.*;
public class MultiIntersect {
    public static void main(String[] args) {
        List<HashSet<Integer>> l = Arrays.asList(new HashSet<>(Arrays.asList(1, 2)), new HashSet<>(Arrays.asList(2, 3)));
        HashSet<Integer> r = new HashSet<>(l.get(0)); for(var s : l) r.retainAll(s);
        System.out.println(r);
    }
}