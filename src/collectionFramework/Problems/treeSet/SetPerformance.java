package collectionFramework.Problems.treeSet;

import java.util.*;
public class SetPerformance {
    public static void main(String[] args) {
        long s = System.nanoTime(); HashSet<Integer> hs = new HashSet<>(); for(int i=0; i<10000; i++) hs.add(i);
        System.out.println("HashSet: " + (System.nanoTime()-s));
        s = System.nanoTime(); TreeSet<Integer> ts = new TreeSet<>(); for(int i=0; i<10000; i++) ts.add(i);
        System.out.println("TreeSet: " + (System.nanoTime()-s));
    }
}