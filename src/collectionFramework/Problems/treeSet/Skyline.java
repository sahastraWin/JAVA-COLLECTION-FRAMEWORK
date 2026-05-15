package collectionFramework.Problems.treeSet;

import java.util.*;
public class Skyline {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>(Collections.reverseOrder()); h.add(0); h.add(10);
        System.out.println("Max Height: " + h.first()); h.remove(10); System.out.println("End: " + h.first());
    }
}