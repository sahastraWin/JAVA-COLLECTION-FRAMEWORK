package collectionFramework.Problems.hashSet;

import java.util.*;
public class Performance {
    public static void main(String[] args) {
        long s = System.nanoTime(); new HashSet<>().add(1); System.out.println(System.nanoTime()-s);
    }
}