package collectionFramework.Problems.hashSet;

import java.util.*;
public class Union {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1)), b = new HashSet<>(Arrays.asList(2));
        a.addAll(b); System.out.println(a);
    }
}