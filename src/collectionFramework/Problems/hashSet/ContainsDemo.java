package collectionFramework.Problems.hashSet;

import java.util.HashSet;
public class ContainsDemo {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(); s.add(1);
        System.out.println(s.contains(1));
    }
}