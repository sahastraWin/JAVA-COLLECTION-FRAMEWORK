package collectionFramework.Problems.arrayList;

import java.util.ArrayList; import java.util.Arrays;
public class EvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for(int n : nums) { if(n%2==0) even.add(n); else odd.add(n); }
        System.out.println(even + " " + odd);
    }
}