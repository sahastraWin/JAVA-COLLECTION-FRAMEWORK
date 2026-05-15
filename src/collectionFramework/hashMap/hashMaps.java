package collectionFramework.hashMap;

import java.util.*;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(200, "Sahastrajeet");
        map.put(100, "Jeet");
        map.put(90, "Vedraj");

        map.put(80, "Vikas");
        String s = map.get(200);

        System.out.println(s);
        System.out.println(map);
        /*
        METHODS:

        Boolean b = map.containsKey(200);
        Boolean k = map.containsValue("Jeet");
        System.out.println(k);

        ITERATION IN hashMap
        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            System.out.println(map.get(i));
        }
        //OR
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
   
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        */

        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries1) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
    }
}
