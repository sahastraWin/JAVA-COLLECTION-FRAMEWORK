package collectionFramework.Problems.arrayList;

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int t = 9; Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.size(); i++) {
            if(map.containsKey(t-nums.get(i))) System.out.println(map.get(t-nums.get(i)) + " " + i);
            map.put(nums.get(i), i);
        }
    }
}