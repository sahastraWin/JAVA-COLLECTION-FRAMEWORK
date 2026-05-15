package collectionFramework.Problems.hashSet;

import java.util.HashSet;
public class RemoveElement {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); set.add("A");
        set.remove("A"); System.out.println(set);
    }
}