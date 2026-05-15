package collectionFramework.Problems.hashSet;

import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        while(n!=1 && s.add(n)) { int sum=0; while(n>0){sum+=(n%10)*(n%10); n/=10;} n=sum; }
        return n==1;
    }
}