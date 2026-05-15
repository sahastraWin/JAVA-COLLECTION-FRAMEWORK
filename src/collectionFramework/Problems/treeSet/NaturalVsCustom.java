package collectionFramework.Problems.treeSet;

import java.util.*;
public class NaturalVsCustom {
    public static void main(String[] args) {
        TreeSet<Integer> natural = new TreeSet<>(); natural.add(10); natural.add(5);
        System.out.println("Natural: " + natural);
        TreeSet<Integer> custom = new TreeSet<>(Comparator.reverseOrder());
        custom.add(10); custom.add(5);
        System.out.println("Custom: " + custom);
    }
}