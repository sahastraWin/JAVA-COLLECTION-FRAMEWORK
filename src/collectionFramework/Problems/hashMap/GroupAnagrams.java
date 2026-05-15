package collectionFramework.Problems.hashMap;

import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s = {"eat", "tea"}; Map<String, List<String>> m = new HashMap<>();
        for(String w:s) { char[] c=w.toCharArray(); Arrays.sort(c); m.computeIfAbsent(new String(c), k->new ArrayList<>()).add(w); }
        System.out.println(m.values());
    }
}