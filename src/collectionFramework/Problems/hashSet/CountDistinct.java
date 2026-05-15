package collectionFramework.Problems.hashSet;

import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        for(int n : new int[]{1, 2}) s.add(n); for(int n : new int[]{2, 3}) s.add(n);
        System.out.println(s.size());
    }
}