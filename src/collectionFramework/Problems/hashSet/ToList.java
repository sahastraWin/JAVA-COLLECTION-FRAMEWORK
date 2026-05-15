package collectionFramework.Problems.hashSet;

import java.util.*;
public class ToList {
    public static void main(String[] args) {
        System.out.println(new ArrayList<>(new HashSet<>(Arrays.asList("A"))));
    }
}