package collectionFramework.Problems.arrayList;

import java.util.*;
public class RearrangeAlt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 2, -3, 4));
        ArrayList<Integer> p = new ArrayList<>(), n = new ArrayList<>();
        for(int x:list) if(x>=0) p.add(x); else n.add(x);
        ArrayList<Integer> res = new ArrayList<>();
        int i=0, j=0;
        while(i<p.size() || j<n.size()) { if(i<p.size()) res.add(p.get(i++)); if(j<n.size()) res.add(n.get(j++)); }
        System.out.println(res);
    }
}