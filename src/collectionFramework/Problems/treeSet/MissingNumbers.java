package collectionFramework.Problems.treeSet;

import java.util.*;
public class MissingNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1, 2, 4, 5));
        for (int i = ts.first(); i <= ts.last(); i++) if (!ts.contains(i)) System.out.println("Missing: " + i);
    }
}