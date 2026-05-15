package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> m1 = new HashMap<>(), m2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c1=s.charAt(i), c2=t.charAt(i);
            if((m1.containsKey(c1)&&m1.get(c1)!=c2) || (m2.containsKey(c2)&&m2.get(c2)!=c1)) return false;
            m1.put(c1, c2); m2.put(c2, c1);
        }
        return true;
    }
}