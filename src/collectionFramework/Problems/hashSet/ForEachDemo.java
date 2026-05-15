package collectionFramework.Problems.hashSet;

import java.util.HashSet;
public class ForEachDemo {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(); s.add(1);
        s.forEach(System.out::println);
    }
}