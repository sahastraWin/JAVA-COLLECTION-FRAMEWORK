package collectionFramework.Problems.hashSet;

import java.util.*;
public class FirstElem {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>(Arrays.asList("A"));
        System.out.println(s.iterator().next());
    }
}