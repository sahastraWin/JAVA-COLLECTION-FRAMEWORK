package collectionFramework.Problems.hashSet;

import java.util.*;
public class StreamDupes {
    public static void main(String[] args) {
        int[] s = {1, 1}; HashSet<Integer> seen = new HashSet<>();
        for(int n:s) if(!seen.add(n)) System.out.println(n);
    }
}