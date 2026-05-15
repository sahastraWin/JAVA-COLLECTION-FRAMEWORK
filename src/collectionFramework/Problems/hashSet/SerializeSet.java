package collectionFramework.Problems.hashSet;

import java.io.*; import java.util.*;
public class SerializeSet {
    public static void main(String[] args) throws Exception {
        HashSet<String> s = new HashSet<>(); s.add("A");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("s.ser")); o.writeObject(s); o.close();
    }
}