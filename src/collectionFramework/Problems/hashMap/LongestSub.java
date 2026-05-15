package collectionFramework.Problems.hashMap;

import java.util.HashMap;
public class LongestSub {
    public static void main(String[] args) {
        String s = "abcabcbb"; HashMap<Character, Integer> m = new HashMap<>(); int max=0, st=0;
        for(int i=0; i<s.length(); i++) {
            if(m.containsKey(s.charAt(i))) st=Math.max(st, m.get(s.charAt(i))+1);
            m.put(s.charAt(i), i); max=Math.max(max, i-st+1);
        }
        System.out.println(max);
    }
}