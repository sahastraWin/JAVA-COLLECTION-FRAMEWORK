package collectionFramework.Problems.hashSet;

import java.util.*;
public class Disjoint {
    public static void main(String[] args) {
        System.out.println(Collections.disjoint(new HashSet<>(Arrays.asList(1)), new HashSet<>(Arrays.asList(2))));
    }
}