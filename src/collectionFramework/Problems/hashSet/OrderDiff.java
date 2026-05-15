package collectionFramework.Problems.hashSet;

import java.util.*;
public class OrderDiff {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2, 1);
        System.out.println(new HashSet<>(l)); System.out.println(new LinkedHashSet<>(l));
    }
}