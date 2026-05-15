package collectionFramework.Problems.hashSet;

import java.util.*;
public class CountParity {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(1, 2));
        System.out.println(s.stream().filter(n->n%2==0).count());
    }
}