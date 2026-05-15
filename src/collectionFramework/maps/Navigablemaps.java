package collectionFramework.maps;

import java.util.*;

public class Navigablemaps {
    public static void main(String[] args) {
        NavigableMap<String, Integer> nmap = new TreeMap<>();
        nmap.put("One", 1);
        nmap.put("Three", 3);
        nmap.put("Two", 2);
        System.out.println(nmap);
        System.out.println(nmap.lowerKey("Three"));//returns the greatest key strictly less than the given key
        System.out.println(nmap.ceilingKey("Two"));

    }
}
