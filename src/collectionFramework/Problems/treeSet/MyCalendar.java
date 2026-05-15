package collectionFramework.Problems.treeSet;

import java.util.TreeMap;
public class MyCalendar {
    TreeMap<Integer, Integer> c = new TreeMap<>();
    public boolean book(int s, int e) {
        Integer p = c.floorKey(s), n = c.ceilingKey(s);
        if ((p == null || c.get(p) <= s) && (n == null || n >= e)) { c.put(s, e); return true; }
        return false;
    }
    public static void main(String[] args) { System.out.println(new MyCalendar().book(10, 20)); }
}