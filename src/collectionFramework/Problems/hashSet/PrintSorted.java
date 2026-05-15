package collectionFramework.Problems.hashSet;

import java.util.*;
public class PrintSorted {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(new HashSet<>(Arrays.asList(2, 1)));
        Collections.sort(l); System.out.println(l);
    }
}