package collectionFramework.Problems.treeSet;

import java.util.*;
public class ListToSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 1));
        TreeSet<Integer> ts = new TreeSet<>(list);
        System.out.println(ts);
    }
}