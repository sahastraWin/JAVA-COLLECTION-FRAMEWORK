package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class PhoneBook {
    HashMap<String, String> m = new HashMap<>();
    void add(String n, String p) { m.put(n, p); }
}