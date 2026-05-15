package collectionFramework.Problems.hashMap;

import java.util.*;
public class LongestSeq {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        int max=0; for(int n:s) if(!s.contains(n-1)) { int c=1; while(s.contains(n+c)) c++; max=Math.max(max, c); }
        System.out.println(max);
    }
}