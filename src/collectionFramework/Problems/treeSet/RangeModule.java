package collectionFramework.Problems.treeSet;

import java.util.TreeMap;
public class RangeModule {
    TreeMap<Integer, Integer> r = new TreeMap<>();
    public void addRange(int left, int right) {
        Integer s = r.floorKey(left), e = r.floorKey(right);
        if(s != null && r.get(s) >= left) left = s;
        if(e != null && r.get(e) > right) right = r.get(e);
        r.subMap(left, right).clear(); r.put(left, right);
    }
}