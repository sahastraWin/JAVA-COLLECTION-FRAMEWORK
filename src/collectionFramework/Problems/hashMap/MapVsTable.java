package collectionFramework.Problems.hashMap;

import java.util.*;
public class MapVsTable {
    public static void main(String[] args) {
        new HashMap<>().put(null, "A");
        try { new Hashtable<>().put(null, "A"); } catch(Exception e){ System.out.println("No nulls in Table"); }
    }
}