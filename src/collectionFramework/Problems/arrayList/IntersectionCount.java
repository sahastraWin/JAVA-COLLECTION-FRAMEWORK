package collectionFramework.Problems.arrayList;

import java.util.*;
public class IntersectionCount {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 2)), l2 = new ArrayList<>(Arrays.asList(2, 2));
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:l1) map.put(n, map.getOrDefault(n,0)+1);
        int c=0;
        for(int n:l2) if(map.getOrDefault(n,0)>0) { c++; map.put(n, map.get(n)-1); }
        System.out.println(c);
    }
}