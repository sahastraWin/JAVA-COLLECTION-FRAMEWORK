package collectionFramework.Problems.arrayList;

import java.util.*;
public class LIS {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18));
        ArrayList<Integer> tails = new ArrayList<>();
        for(int n : nums) {
            int i = Collections.binarySearch(tails, n);
            if(i<0) i=-(i+1);
            if(i==tails.size()) tails.add(n); else tails.set(i, n);
        }
        System.out.println(tails.size());
    }
}