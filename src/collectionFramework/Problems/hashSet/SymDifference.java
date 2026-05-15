package collectionFramework.Problems.hashSet;

import java.util.*;
public class SymDifference {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2)), b = new HashSet<>(Arrays.asList(2, 3));
        HashSet<Integer> u = new HashSet<>(a); u.addAll(b);
        HashSet<Integer> i = new HashSet<>(a); i.retainAll(b);
        u.removeAll(i); System.out.println(u);
    }
}