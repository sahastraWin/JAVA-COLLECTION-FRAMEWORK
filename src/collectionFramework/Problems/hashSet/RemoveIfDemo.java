package collectionFramework.Problems.hashSet;

import java.util.*;
public class RemoveIfDemo {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(1, 2));
        s.removeIf(n -> n > 1); System.out.println(s);
    }
}