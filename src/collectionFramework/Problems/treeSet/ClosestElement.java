package collectionFramework.Problems.treeSet;

import java.util.*;
public class ClosestElement {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 20, 30));
        int target = 24; Integer floor = ts.floor(target), ceiling = ts.ceiling(target);
        if (floor == null) System.out.println("Closest: " + ceiling);
        else if (ceiling == null) System.out.println("Closest: " + floor);
        else System.out.println("Closest: " + ((target - floor <= ceiling - target) ? floor : ceiling));
    }
}