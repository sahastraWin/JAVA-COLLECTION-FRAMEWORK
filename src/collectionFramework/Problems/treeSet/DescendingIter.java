package collectionFramework.Problems.treeSet;

import java.util.*;
public class DescendingIter {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); ts.add(1); ts.add(2); ts.add(3);
        Iterator<Integer> it = ts.descendingIterator(); while(it.hasNext()) System.out.print(it.next() + " ");
    }
}