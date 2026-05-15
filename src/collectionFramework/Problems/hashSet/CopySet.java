package collectionFramework.Problems.hashSet;

import java.util.*;
public class CopySet {
    public static void main(String[] args) {
        System.out.println(new HashSet<>(new HashSet<>(Arrays.asList(1))));
    }
}