package collectionFramework.Problems.hashSet;

import java.util.*;
public class SpellCheck {
    public static void main(String[] args) {
        HashSet<String> d = new HashSet<>(Arrays.asList("hello"));
        for(String w : "hello world".split(" ")) if(!d.contains(w)) System.out.println(w);
    }
}