package collectionFramework.Problems.hashMap;

import java.util.*;
class B { public int hashCode(){return 1;} }
public class Collision {
    public static void main(String[] args) {
        HashMap<B, String> m = new HashMap<>(); m.put(new B(), "A"); m.put(new B(), "B");
    }
}