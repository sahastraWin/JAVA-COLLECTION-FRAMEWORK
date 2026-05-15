package collectionFramework.Problems.arrayList;

import java.util.*;
public class MissingNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4));
        int n=4, sum = list.stream().mapToInt(i->i).sum();
        System.out.println((n*(n+1)/2) - sum);
    }
}