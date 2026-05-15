package collectionFramework.Problems.hashSet;

import java.util.*;
public class UniqueChars {
    public static void main(String[] args) {
        HashSet<Character> u = new HashSet<>();
        for(char c : "abc".toCharArray()) u.add(c); System.out.println(u);
    }
}