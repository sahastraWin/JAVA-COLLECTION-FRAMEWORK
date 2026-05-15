package collectionFramework.Problems.treeSet;

import java.util.*;
public class RemoveAllFrom {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>(Arrays.asList(1, 2));
        ts1.removeAll(Arrays.asList(1));
        System.out.println(ts1);
    }
}