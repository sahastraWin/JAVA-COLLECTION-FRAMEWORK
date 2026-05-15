package collectionFramework.Problems.hashMap;

import java.util.*;
public class KeyByVal {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); map.put("A", 1);
        for(var e : map.entrySet()) if(e.getValue()==1) System.out.println(e.getKey());
    }
}