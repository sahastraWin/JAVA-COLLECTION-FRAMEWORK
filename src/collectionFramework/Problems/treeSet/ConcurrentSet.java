package collectionFramework.Problems.treeSet;

import java.util.concurrent.ConcurrentSkipListSet;
public class ConcurrentSet {
    public static void main(String[] args) {
        System.out.println(new ConcurrentSkipListSet<>(java.util.Arrays.asList(1, 2)));
    }
}