package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class WordPattern {
    public static boolean wordPattern(String p, String s) {
        String[] w = s.split(" "); if(w.length!=p.length()) return false;
        HashMap<Character, String> m = new HashMap<>();
        for(int i=0; i<p.length(); i++) {
            char c=p.charAt(i);
            if(m.containsKey(c)) { if(!m.get(c).equals(w[i])) return false; }
            else { if(m.containsValue(w[i])) return false; m.put(c, w[i]); }
        }
        return true;
    }
}