package collectionFramework.Problems.arrayList;

import java.util.*;
public class ComparePerf {
    public static void main(String[] args) {
        long s = System.nanoTime();
        new ArrayList<>().add(0, 1);
        System.out.println("AL: " + (System.nanoTime()-s));
    }
}