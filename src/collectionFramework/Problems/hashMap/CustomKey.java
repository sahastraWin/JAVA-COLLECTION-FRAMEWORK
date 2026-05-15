package collectionFramework.Problems.hashMap;

import java.util.*;
class Key { int i; Key(int i){this.i=i;} public int hashCode(){return i;} public boolean equals(Object o){return ((Key)o).i==i;} }
public class CustomKey {
    public static void main(String[] args) {
        HashMap<Key, String> m = new HashMap<>(); m.put(new Key(1), "V"); System.out.println(m.get(new Key(1)));
    }
}