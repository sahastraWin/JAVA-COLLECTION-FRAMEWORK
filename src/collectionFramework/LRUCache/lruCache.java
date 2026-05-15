package collectionFramework.LRUCache;

import java.util.*;

public class lruCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public lruCache(int capacity) {
        super(capacity, 23, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;//least recently used i.e Bob will be removed
    }

    public static void main(String[] args) {
        lruCache<String, Integer> l = new lruCache<>(2);
        l.put("Bob", 91);
        l.put("Alice", 93);
        l.put("Ram", 94);
        System.out.println(l);
    }
}
