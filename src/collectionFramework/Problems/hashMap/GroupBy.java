package collectionFramework.Problems.hashMap;

import java.util.*;
class P { String n, r; P(String n, String r){this.n=n;this.r=r;} public String toString(){return n;} }
public class GroupBy {
    public static void main(String[] args) {
        List<P> l = Arrays.asList(new P("A", "D"), new P("B", "D")); Map<String, List<P>> m = new HashMap<>();
        for(P p:l) m.computeIfAbsent(p.r, k->new ArrayList<>()).add(p); System.out.println(m);
    }
}