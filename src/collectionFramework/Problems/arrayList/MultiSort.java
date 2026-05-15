package collectionFramework.Problems.arrayList;

import java.util.*;
class P { String c; int p; P(String c, int p){this.c=c;this.p=p;} public String toString(){return c+p;} }
public class MultiSort {
    public static void main(String[] args) {
        ArrayList<P> l = new ArrayList<>(Arrays.asList(new P("A", 2), new P("A", 1)));
        l.sort(Comparator.comparing((P p)->p.c).thenComparingInt(p->p.p));
        System.out.println(l);
    }
}