package collectionFramework.Problems.hashSet;

import java.util.Arrays;
public class PartitionSum {
    public static boolean canPartition(int[] n) {
        int s = Arrays.stream(n).sum(); if(s%2!=0) return false;
        boolean[] dp = new boolean[s/2+1]; dp[0]=true;
        for(int x:n) for(int i=s/2; i>=x; i--) dp[i]|=dp[i-x]; return dp[s/2];
    }
}