package collectionFramework.Problems.hashSet;

import java.util.*;
public class MultiUnion {
    public static void main(String[] args) {
        HashSet<Integer> r = new HashSet<>();
        for(var s : Arrays.asList(new HashSet<>(Arrays.asList(1)), new HashSet<>(Arrays.asList(2)))) r.addAll(s);
        System.out.println(r);
    }
}