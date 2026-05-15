package collectionFramework.Problems.treeSet;

import java.util.*;
public class SetToList {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(1); ts.add(2);
        ArrayList<Integer> list = new ArrayList<>(ts);
        System.out.println(list);
    }
}