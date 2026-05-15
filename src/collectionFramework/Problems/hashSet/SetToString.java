package collectionFramework.Problems.hashSet;

import java.util.*;
public class SetToString {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>(Arrays.asList("A", "B"));
        System.out.println(String.join(", ", s));
    }
}