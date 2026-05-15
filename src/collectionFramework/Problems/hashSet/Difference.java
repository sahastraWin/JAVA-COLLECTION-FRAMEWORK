package collectionFramework.Problems.hashSet;

import java.util.*;
public class Difference {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2)), b = new HashSet<>(Arrays.asList(2));
        a.removeAll(b); System.out.println(a);
    }
}