package collectionFramework.Problems.hashSet;

import java.util.*;
public class SyncSet {
    public static void main(String[] args) {
        Set<String> s = Collections.synchronizedSet(new HashSet<>()); s.add("A");
        synchronized(s) { for(String v:s) System.out.println(v); }
    }
}