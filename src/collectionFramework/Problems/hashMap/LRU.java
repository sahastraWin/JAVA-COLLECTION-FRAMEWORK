package collectionFramework.Problems.hashMap;

import java.util.*;
public class LRU extends LinkedHashMap<Integer, Integer> {
    int c; LRU(int c){super(c, 0.75f, true); this.c=c;}
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e){return size()>c;}
}