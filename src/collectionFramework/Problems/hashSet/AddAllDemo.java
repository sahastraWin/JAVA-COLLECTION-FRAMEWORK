package collectionFramework.Problems.hashSet;

import java.util.*;
public class AddAllDemo {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1));
        s1.addAll(Arrays.asList(2)); System.out.println(s1);
    }
}