package collectionFramework.Problems.arrayList;

import java.util.*;
public class FindDupes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        HashSet<Integer> seen = new HashSet<>(), dupes = new HashSet<>();
        for(int n:list) if(!seen.add(n)) dupes.add(n);
        System.out.println(dupes);
    }
}