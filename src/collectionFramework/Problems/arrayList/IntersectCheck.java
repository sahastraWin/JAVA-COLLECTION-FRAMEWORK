package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays; import java.util.Collections;
public class IntersectCheck {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("B", "C"));
        System.out.println(!Collections.disjoint(l1, l2));
    }
}