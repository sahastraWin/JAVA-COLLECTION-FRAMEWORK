package collectionFramework.Problems.hashSet;

import java.util.*;
public class FirstRepeat {
    public static void main(String[] args) {
        int[] a = {2, 1, 2}; HashSet<Integer> s = new HashSet<>();
        for(int i=a.length-1; i>=0; i--) if(s.contains(a[i])) System.out.println(a[i]); else s.add(a[i]);
    }
}