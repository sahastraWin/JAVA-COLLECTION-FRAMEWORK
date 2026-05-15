package collectionFramework.Problems.hashMap;

import java.util.WeakHashMap;
public class WeakMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Object, String> m = new WeakHashMap<>(); Object k=new Object(); m.put(k, "D");
        k=null; System.gc(); System.out.println(m.size());
    }
}