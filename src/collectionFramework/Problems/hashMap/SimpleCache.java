package collectionFramework.Problems.hashMap;

import java.util.*;
class I { Object v; long e; I(Object v, long e){this.v=v;this.e=e;} }
class SimpleCache {
    HashMap<String, I> m = new HashMap<>();
    void put(String k, Object v, int t) { m.put(k, new I(v, System.currentTimeMillis()+t)); }
}