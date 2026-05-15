package collectionFramework.Problems.hashSet;

import java.util.*;
public class MissingNum {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(1, 3));
        for(int i=1; i<=3; i++) if(!s.contains(i)) System.out.println(i);
    }
}