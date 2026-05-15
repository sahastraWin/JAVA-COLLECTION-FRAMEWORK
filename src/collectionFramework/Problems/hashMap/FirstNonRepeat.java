package collectionFramework.Problems.hashMap;

import java.util.LinkedHashMap;
public class FirstNonRepeat {
    public static void main(String[] args) {
        String s = "leet"; LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();
        for(char c:s.toCharArray()) m.put(c, m.getOrDefault(c, 0)+1);
        for(char k:m.keySet()) if(m.get(k)==1) { System.out.println(k); return; }
    }
}