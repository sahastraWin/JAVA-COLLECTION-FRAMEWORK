package collectionFramework.Problems.hashSet;

import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>(); s.add("A");
        Iterator<String> it = s.iterator(); while(it.hasNext()) System.out.println(it.next());
    }
}