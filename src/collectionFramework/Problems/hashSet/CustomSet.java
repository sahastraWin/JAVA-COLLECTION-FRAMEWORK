package collectionFramework.Problems.hashSet;

import java.util.*;
class P { int i; P(int i){this.i=i;} public int hashCode(){return i;} public boolean equals(Object o){return ((P)o).i==i;} }
public class CustomSet {
    public static void main(String[] args) {
        HashSet<P> s = new HashSet<>(); s.add(new P(1)); s.add(new P(1)); System.out.println(s.size());
    }
}