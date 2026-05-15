package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class GetSubset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(); for(int i=1; i<=5; i++) ts.add(i);
        System.out.println("Subset [2, 4]: " + ts.subSet(2, true, 4, true));
    }
}