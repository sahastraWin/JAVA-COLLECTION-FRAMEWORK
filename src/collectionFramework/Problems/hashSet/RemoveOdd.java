package collectionFramework.Problems.hashSet;

import java.util.*;
public class RemoveOdd {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(1, 2));
        s.removeIf(n -> n % 2 != 0); System.out.println(s);
    }
}