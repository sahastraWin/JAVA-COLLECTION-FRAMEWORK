package collectionFramework.Problems.arrayList;

import java.util.*;
public class LongestConsecutive {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        HashSet<Integer> set = new HashSet<>(nums);
        int max = 0;
        for(int n : set) {
            if(!set.contains(n-1)) {
                int curr = n, c = 1;
                while(set.contains(curr+1)) { curr++; c++; }
                max = Math.max(max, c);
            }
        }
        System.out.println(max);
    }
}