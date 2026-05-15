package collectionFramework.Problems.treeSet;

import java.util.*;
class Interval implements Comparable<Interval> { int s, e; Interval(int s, int e) { this.s = s; this.e = e; } public int compareTo(Interval i) { return this.s - i.s; } public String toString() { return "["+s+","+e+"]"; } }
public class MergeIntervals {
    public static void main(String[] args) {
        TreeSet<Interval> ts = new TreeSet<>(); ts.add(new Interval(1, 3)); ts.add(new Interval(2, 6)); ts.add(new Interval(8, 10));
        ArrayList<Interval> res = new ArrayList<>();
        for (Interval i : ts) {
            if (res.isEmpty() || res.get(res.size()-1).e < i.s) res.add(i);
            else res.get(res.size()-1).e = Math.max(res.get(res.size()-1).e, i.e);
        }
        System.out.println(res);
    }
}