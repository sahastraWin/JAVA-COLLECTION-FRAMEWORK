package collectionFramework.Problems.treeSet;

import java.util.*;
public class FloorCeiling {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 20, 30)); int val = 25;
        System.out.println("Floor: " + ts.floor(val) + " Ceiling: " + ts.ceiling(val));
    }
}