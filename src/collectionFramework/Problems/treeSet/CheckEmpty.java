package collectionFramework.Problems.treeSet;

import java.util.TreeSet;
public class CheckEmpty {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        System.out.println("Is empty? " + ts.isEmpty());
        ts.add("A");
        System.out.println("Is empty? " + ts.isEmpty());
    }
}