package collectionFramework.Problems.arrayList;

import java.util.*;
public class ThreadSafeAL {
    public static void main(String[] args) {
        List<String> l = Collections.synchronizedList(new ArrayList<>());
        l.add("A");
        synchronized(l) { for(String s:l) System.out.println(s); }
    }
}